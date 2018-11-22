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

    public void assignKelas(Kelas kelas, Ruang ruang, int hari, int jam) {
        Slot slot = new Slot(kelas,ruang);
        ArrayList<ArrayList<Slot>> jadwalhari = jadwalKelas.get(hari);
        ArrayList<Slot> jadwaljam = jadwalKelas.get(hari).get(jam);
        jadwaljam.add(slot);
        jadwalhari.set(jam,jadwaljam);
        jadwalKelas.set(hari,jadwalhari);
    }

    public boolean cekTingkatSama(Kelas kelas, int hari, int jam) {
        return false;
    }

    public boolean cekKapasitas(Kelas kelas, Ruang ruang) {
        return true;
    }

    public boolean cekFasilitas(Kelas kelas, Ruang ruang) {
        return true;
    }
}
