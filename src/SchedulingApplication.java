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
                    if (jadwal.isAvailable(ruang, kelas.hariPref, kelas.jamPref)) {
                        ruangDipilih = ruang;
                        break;
                    }
                }
                if (ruangDipilih != null) {
                    assigned = jadwal.assignKelas(kelas, ruangDipilih, kelas.hariPref, kelas.jamPref);
                }
            }
            if (!assigned) {
                if (kelas.getTingkat() == 2) {
                    //Tingkat 2, jam 1 ke atas
                    int hari = 1;
                    while (!assigned && hari <= 5) {
                        int jam = 7;
                        while (!assigned && jam <= 11) {
                            if (jadwal.cekTingkatSama(kelas, hari, jam)) {
                                for (Ruang ruang : listRuang) { //cari kelas
                                    assigned = jadwal.assignKelas(kelas, ruang, hari, jam);
                                    if (assigned) {
                                        break;
                                    }
                                }
                            }
                            jam++;
                        }
                        hari++;
                    }
                } else if (kelas.getTingkat() == 3) {
                    //Tingkat 3, jam 7 ke atas, sebelum jam 12
                    int hari = 1;
                    while (!assigned && hari <= 5) {
                        int jam = 1;
                        while (!assigned && jam <= 5) {
                            if (jadwal.cekTingkatSama(kelas, hari, jam)) {
                                for (Ruang ruang : listRuang) { //cari kelas
                                    assigned = jadwal.assignKelas(kelas, ruang, hari, jam);
                                    if (assigned) {
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
                    int hari = 1;
                    while (!assigned && hari <= 5) {
                        int jam = 1;
                        while (!assigned && jam <= 11) {
                            if (jadwal.cekTingkatSama(kelas, hari, jam)) {
                                for (Ruang ruang : listRuang) { //cari kelas
                                    assigned = jadwal.assignKelas(kelas, ruang, hari, jam);
                                    if (assigned) {
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
//        Lihat Jadwal
//        Lihat Kelas
//        Lihat Ruang

        }
    }
}
