package entity;

import java.util.ArrayList;
import java.util.List;

public class Penjadwalan {
    public ArrayList<ArrayList<ArrayList<Slot>>> jadwalKelas;

    public Penjadwalan() {
        this.jadwalKelas = new ArrayList<>();
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

    public boolean assignKelas(Kelas kelas, Ruang ruang, int hari, int jam) {
        if (cekKapasitas(kelas, ruang) && cekFasilitas(kelas, ruang)) {
            Slot slot = new Slot(kelas, ruang);
            ArrayList<ArrayList<Slot>> jadwalhari = jadwalKelas.get(hari);
            ArrayList<Slot> jadwaljam = jadwalKelas.get(hari).get(jam);
            jadwaljam.add(slot);
            jadwalhari.set(jam, jadwaljam);
            jadwalKelas.set(hari, jadwalhari);
            kelas.isAssigned = true;
            return true;
        } else {
            return false;
        }

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

    
}
