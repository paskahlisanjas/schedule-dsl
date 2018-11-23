package entity;

import java.util.ArrayList;
import java.util.List;

public class Penjadwalan {
    public ArrayList<ArrayList<ArrayList<Slot>>> jadwalKelas;

    public Penjadwalan() {
        this.jadwalKelas = new ArrayList<>();
        int i;

        ArrayList<Slot> listJam = new ArrayList<>();
        ArrayList<ArrayList<Slot>> listHari = new ArrayList<>();
        for(i=1;i<=5;i++) {
            jadwalKelas.add(new ArrayList<>());
        }
        for(ArrayList jadwalHari: jadwalKelas) {
            for(i=1;i<=11;i++) {
                jadwalHari.add(new ArrayList<>());
            }
        }

    }

    public void jadwalkan (List<Kelas> listKelas, List<Ruang> listRuang) {
        int hari;
        int jam;
        for (Kelas kelas : listKelas) {
            if (!kelas.isAssigned && kelas.isAvailable) {
                if (kelas.hariPref != 0) {
                    // cari kelas
                    Ruang ruangDipilih = null;
                    for (Ruang ruang : listRuang) {
                        if (isAvailable(ruang, kelas.hariPref, kelas.jamPref)) {
                            ruangDipilih = ruang;
                            break;
                        }
                    }
                    if (ruangDipilih != null) {
                        kelas.isAssigned = assignKelas(kelas, ruangDipilih, kelas.hariPref, kelas.jamPref);
                    }
                }
                if (!kelas.isAssigned) {
                    if (kelas.getTingkat() == '2') {
                        //Tingkat 2, jam 1 ke atas
                        hari = 0;
                        while (!kelas.isAssigned && hari <= 4) {
                            jam = 6;
                            while (!kelas.isAssigned && jam <= 10) {
                                if (cekTingkatSama(kelas, hari, jam)) {
                                    for (Ruang ruang : listRuang) { //cari kelas
                                        kelas.isAssigned = assignKelas(kelas, ruang, hari, jam);
                                        if (kelas.isAssigned) {
                                            break;
                                        }
                                    }
                                }
                                jam++;
                            }
                            hari++;
                        }
                    } else if (kelas.getTingkat() == '3') {
                        //Tingkat 3, jam 7 ke atas, sebelum jam 12
                        hari = 0;
                        while (!kelas.isAssigned && hari <= 4) {
                            jam = 0;
                            while (!kelas.isAssigned && jam <= 4) {
                                if (cekTingkatSama(kelas, hari, jam)) {
                                    for (Ruang ruang : listRuang) { //cari kelas
                                        kelas.isAssigned = assignKelas(kelas, ruang, hari, jam);
                                        if (kelas.isAssigned) {
                                            break;
                                        }
                                    }
                                }
                                jam++;
                            }
                            hari++;
                        }
                    } else {
                        //Tingkat 4, bebas
                        System.out.println(kelas.getTingkat());
                        hari = 0;
                        while (!kelas.isAssigned && hari <= 4) {
                            jam = 0;
                            while (!kelas.isAssigned && jam <= 10) {
                                if (cekTingkatSama(kelas, hari, jam)) {
                                    for (Ruang ruang : listRuang) { //cari kelas
                                        kelas.isAssigned = assignKelas(kelas, ruang, hari, jam);
                                        if (kelas.isAssigned) {
                                            break;
                                        }
                                    }
                                }
                                jam++;
                            }
                            hari++;
                        }
                    }
                }
            }
        }
    }

    public boolean assignKelas(Kelas kelas, Ruang ruang, int hari, int jam) {
        if (cekKapasitas(kelas, ruang) && cekFasilitas(kelas, ruang) && isAvailable(ruang,hari,jam)) {
            Slot slot = new Slot(kelas, ruang);
            ArrayList<ArrayList<Slot>> jadwalhari = jadwalKelas.get(hari);
            ArrayList<Slot> jadwaljam = jadwalKelas.get(hari).get(jam);
            jadwaljam.add(slot);
            jadwalhari.set(jam, jadwaljam);
            jadwalKelas.set(hari, jadwalhari);
            return true;
        } else {
            return false;
        }
    }

    public boolean isAvailable(Ruang ruang, int hari, int jam) {
        // return true jika ruang kosong
        List<Slot> listKelas = jadwalKelas.get(hari).get(jam);
        boolean availability = true;
        for (Slot slot : listKelas) {
            if (slot.ruang.kode.equals(ruang.kode)) {
                availability = false;
                break;
            }
        }
        return availability;
    }

    public boolean cekTingkatSama(Kelas kelas, int hari, int jam) {
        //return true jika tidak ada yang sama
        ArrayList<Slot> listjam = jadwalKelas.get(hari).get(jam);
        boolean cektingkat = true;
        for (Slot slot : listjam) {
            if (slot.kelas.getTingkat() == kelas.getTingkat()) {
                cektingkat = false;
                break;
            }
        }
        return cektingkat;
    }

    public boolean cekKapasitas(Kelas kelas, Ruang ruang) {
        //return true apabila kelas mencukupi
        return (ruang.kapasitas >= kelas.jumlahMhs);
    }

    public boolean cekFasilitas(Kelas kelas, Ruang ruang) {
        // return true apabila fasilitas memadai
        boolean isMemadai = true;
        for (String kebutuhan : kelas.kebutuhan) {
            boolean found = false;
            for (String fasilitas : ruang.fasilitas) {
                if (kebutuhan.equals(fasilitas)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                isMemadai = false;
            }
        }
        return isMemadai;
    }

    public void lihatKelas(Kelas kelas) {
        // print jam diadakan kelas dan ruangannya
        for (ArrayList<ArrayList<Slot>> listHari: jadwalKelas) {
            for (ArrayList<Slot> listJam: listHari) {
                for (Slot kuliah: listJam) {
                    if (kuliah.kelas.kode.equals(kelas.kode)) {
                        System.out.println("Kuliah hari " + getHari(jadwalKelas.indexOf(listHari)) + " jam " +
                                getJam(listHari.indexOf(listJam)) + " di " + kuliah.ruang.kode);
                        break;
                    }
                }
            }
        }
    }

    public void lihatRuang(Ruang ruang) {
        // print jam dan hari digunakan suatu ruang dan kuliahnya apa
        for (ArrayList<ArrayList<Slot>> listHari: jadwalKelas) {
            for (ArrayList<Slot> listJam: listHari) {
                for (Slot kuliah: listJam) {
                    if (kuliah.ruang.kode.equals(ruang.kode)) {
                        System.out.println("Kelas digunakan kuliah " + kuliah.kelas.kode + "Hari" +
                                getHari(jadwalKelas.indexOf(listHari)) + " jam " + getJam(listHari.indexOf(listJam)));
                    }
                }
            }
        }
    }

    public String getHari(int hari) {
        switch (hari) {
            case 1:
                return "SENIN";
            case 2:
                return "SELASA";
            case 3:
                return "RABU";
            case 4:
                return "KAMIS";
            case 5:
                return "JUMAT";
            default:
                return "HARI ERROR";
        }
    }

    public String getJam(int jam) {
        return String.valueOf(jam+6);
    }

    public void printJadwal() {
        int hari = 1;
        for (ArrayList<ArrayList<Slot>> listHari: jadwalKelas) {
            System.out.println("HARI " + getHari(hari) + ":");
            int jam = 1;
            for (ArrayList<Slot> listJam: listHari) {
                System.out.println("Jam " + getJam(jam) + ":");
                for (Slot kuliah: listJam) {
                    System.out.println(kuliah.kelas.kode + " di " + kuliah.ruang.kode);
                }
                jam++;
            }
            hari++;
        }
    }

    public void printJadwalz(int banyakKelas) {
        //Print Label
        System.out.println("JAM|  SENIN  |  SELASA  |  RABU  |  KAMIS  |  JUMAT  |");
        //print per jam
        int jam;
        int hari;
        int line;
        for (jam = 0; jam <= 10; jam++) {
            //print per line
            for(line = 0; line <= banyakKelas; line++) {
                if(line == 0) {
                    System.out.print(" " + String.valueOf(jam+7) + " ");
                } else {
                    System.out.print("   ");
                }
                //print per hari
                for(hari=0;hari<=4;hari++) {

                }
            }
        }

    }
}
