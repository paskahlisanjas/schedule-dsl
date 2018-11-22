package entity;

import java.util.ArrayList;
import java.util.List;

public class Penjadwalan {
    public ArrayList<ArrayList<ArrayList<Slot>>> jadwalKelas;

    public Penjadwalan() {
        this.jadwalKelas =  new ArrayList<>();
    }

    public boolean isAvailable(Ruang ruang, int hari, int jam) {
        List<Slot> listKelas = jadwalKelas.get(hari).get(jam);
        boolean availability = true;
        for (Slot slot: listKelas) {
            if (slot.ruang.kode.equals(ruang.kode)) {
                availability = false;
                break;
            }
        }
        return availability;
    }

    public boolean assignKelas(Kelas kelas, Ruang ruang, int hari, int jam) {
        if (cekKapasitas(kelas,ruang) && cekFasilitas(kelas,ruang)) {
            Slot slot = new Slot(kelas,ruang);
            ArrayList<ArrayList<Slot>> jadwalhari = jadwalKelas.get(hari);
            ArrayList<Slot> jadwaljam = jadwalKelas.get(hari).get(jam);
            jadwaljam.add(slot);
            jadwalhari.set(jam,jadwaljam);
            jadwalKelas.set(hari,jadwalhari);
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
            if(slot.kelas.getTingkat() == kelas.getTingkat()) {
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
        for (String kebutuhan: kelas.kebutuhan) {
            boolean found = false;
            for (String fasilitas: ruang.fasilitas) {
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
}
