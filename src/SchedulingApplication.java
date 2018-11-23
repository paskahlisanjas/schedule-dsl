import entity.Kelas;
import entity.Penjadwalan;
import entity.Ruang;
import translator.Translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchedulingApplication {
    final static String DATABASE_PATH = "schedule.db";
    static List<Kelas> listKelas = new ArrayList<>();
    static List<Ruang> listRuang = new ArrayList<>();
    static Translator translator = new Translator(listKelas, listRuang);

    static void runConsole() {
        StringBuilder input;
        do {
            System.out.print(">> ");
            Scanner scanner = new Scanner(System.in);
            input = new StringBuilder();
            do {
                input.append(scanner.nextLine());
                if (!input.toString().contains(";")) {
                    input.append("\n");
                    System.out.print(".. ");
                }
            } while (!input.toString().contains(";"));

            if (!input.toString().contains("STOP")) {
                translator.translate(input.toString());
                translator.runCommand();
            }
        } while (!input.toString().contains("STOP"));
    }

    public static void main(String args[]) {
        runConsole();

//        DatabaseManager dbmanager = new DatabaseManager(DATABASE_PATH)
        Penjadwalan jadwal = new Penjadwalan();
//        runConsole();
//        Bikin Kelas
        List<String> kebutuhan = new ArrayList<>();
        kebutuhan.add("AC");
        kebutuhan.add("PAPANTULIS");
        kebutuhan.add("PROYEKTOR");

        listRuang.add(new Ruang("7604",50,kebutuhan));
        listRuang.add(new Ruang("7602",70,kebutuhan));
        listRuang.add(new Ruang("7603",60,kebutuhan));

//        listKelas.add(new Kelas("IF4072",kebutuhan,50,1,8));
//        listKelas.add(new Kelas("IF2110",kebutuhan,60));
//        listKelas.add(new Kelas("IF3110",kebutuhan,60));

//        Bikin Ruang
//        Jadwalkan
//        for each Kelas, Assign Kelas ke Ruangan dan Waktu
//        Constraint & Preferences:
//            - Kelas dengan tingkat yang sama tidak boleh tabrakan
//            - Kapasitas ruangan >= jumlah Mhs
//            - Kebutuhan harus dipenuhi oleh fasilitas kelas
//            - Preferensi hari dan jam sudah ditentukan
        jadwal.jadwalkan(listKelas,listRuang);
        jadwal.printJadwal();
    }
}
