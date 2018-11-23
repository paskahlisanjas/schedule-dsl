package entity;

import java.util.List;

public class Kelas {
    public int jumlahMhs;
    public String kode;
    public List<String> kebutuhan;
    public int hariPref;
    public int jamPref;
    public boolean isAssigned;
    public boolean isAvailable;

    public Kelas() {
    }

    public Kelas(String kode, List<String> kebutuhan, int jumlahMhs, int hariPref, int jamPref, boolean isAvailable) {
        this.kode = kode;
        this.jumlahMhs = jumlahMhs;
        this.kebutuhan = kebutuhan;
        this.isAssigned = false;
        this.isAvailable = isAvailable;
        this.hariPref = hariPref;
        this.jamPref = jamPref;
    }

    public Kelas(String kode, List<String> kebutuhan, int jumlahMhs, boolean isAvailable) {
        this.kode = kode;
        this.kebutuhan = kebutuhan;
        this.isAssigned = false;
        this.isAvailable = isAvailable;
        this.jumlahMhs = jumlahMhs;
        this.hariPref = 0;
        this.jamPref = 0;
    }

    public char getTingkat() {
        return this.kode.charAt(2);
    }

    @Override
    public String toString() {
        String ketersediaan = isAvailable ? "TERSEDIA" : "TIDAK TERSEDIA";
        return "Kelas: " + kode + " (" + jumlahMhs + " orang) " + kebutuhan.toString() + " <Preferensi: " + hariPref + " - " + jamPref + "> " + ketersediaan;
    }
}
