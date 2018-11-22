package entity;

import parser.SchedulingGrammarParser;

import java.util.List;

public class Kelas {
    public int jumlahMhs;
    public String kode;
    public List<String> waktu;
    public List<String> kebutuhan;
    public int hariPref;
    public int jamPref;
    public boolean isAssigned;
    public boolean isAvailable;

    public Kelas(String kode, List<String> kebutuhan, int jumlahMhs, int hariPref, int jamPref) {
        this.kode = kode;
        this.kebutuhan = kebutuhan;
        this.isAssigned = false;
        this.isAvailable = true;
        this.hariPref = hariPref;
        this.jamPref = jamPref;
    }

    public Kelas(String kode, List<String> kebutuhan, int jumlahMhs) {
        this.kode = kode;
        this.kebutuhan = kebutuhan;
        this.isAssigned = false;
        this.isAvailable = true;
        this.hariPref = 0;
        this.jamPref = 0;
    }

    public char getTingkat() {
        return this.kode.charAt(2);
    }
}
