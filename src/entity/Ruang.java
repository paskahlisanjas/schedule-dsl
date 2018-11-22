package entity;

import java.util.List;

public class Ruang {
    public String kode;
    public int kapasitas;
    public List<String> fasilitas;
    public boolean[][] availability;

    public Ruang(String kode, int kapasitas, List<String> fasilitas) {
        this.kode = kode;
        this.kapasitas = kapasitas;
        this.fasilitas = fasilitas;
    }

    @Override
    public String toString() {
        return "Ruang: " + kode + " (" + kapasitas + " orang) " + fasilitas.toString();
    }
}
