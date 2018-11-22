import dbmanager.DatabaseManager;
import entity.Kelas;
import entity.Penjadwalan;
import entity.Ruang;

import java.util.ArrayList;
import java.util.List;

public class SchedulingApplication {
    final static String DATABASE_PATH = "schedule.db";
    static List<Kelas> listKelas = new ArrayList<>();
    static List<Ruang> listRuang = new ArrayList<>();

    public static void main(String args[]) {
//        DatabaseManager dbmanager = new DatabaseManager(DATABASE_PATH)
        Penjadwalan jadwal = new Penjadwalan();
//        Bikin Kelas
//        Bikin Ruang
//        Jadwalkan
//        for each Kelas, Assign Kelas ke Ruangan dan Waktu
//        Constraint & Preferences:
//            - Kelas dengan tingkat yang sama tidak boleh tabrakan
//            - Kapasitas ruangan >= jumlah Mhs
//            - Kebutuhan harus dipenuhi oleh fasilitas kelas
//            - Preferensi hari dan jam sudah ditentukan
        for (Kelas kelas : listKelas) {
                // Cek Preferensi
            boolean assigned = false;
            if (kelas.hariPref != 0) {
                // cari kelas
                Ruang ruangDipilih = null;
                for (Ruang ruang : listRuang) {
                    if(jadwal.isAvailable(ruang,kelas.hariPref,kelas.jamPref)) {
                        ruangDipilih = ruang;
                        break;
                    }
                }
                if (ruangDipilih != null) {
                    jadwal.assignKelas(kelas,ruangDipilih,kelas.hariPref,kelas.jamPref);
                }
                assigned = true;
            }
            if (!assigned) {

            }
        }
//        Lihat Jadwal
//        Lihat Kelas
//        Lihat Ruang

    }
}
