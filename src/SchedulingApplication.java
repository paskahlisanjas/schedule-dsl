import entity.Kelas;
import entity.Penjadwalan;
import entity.Ruang;
import translator.Translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchedulingApplication {
    final static String DATABASE_PATH = "schedule.db";
    private static List<Kelas> listKelas = new ArrayList<>();
    private static List<Ruang> listRuang = new ArrayList<>();
    private static Penjadwalan jadwal = new Penjadwalan();
    private static Translator translator = new Translator(listKelas, listRuang, jadwal);

    private static void runConsole() {
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
    }
}
