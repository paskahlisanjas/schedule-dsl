package translator;

import entity.Kelas;
import entity.Ruang;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.SchedulingGrammarLexer;
import parser.SchedulingGrammarParser;
import parser.SchedulingGrammarParser.EkspresiContext;

import java.util.List;

public class Translator {
    public static final String KELAS_OJBECT = "KELAS";
    public static final String RUANG_OJBECT = "RUANG";
    public static final String JADWAL_OBJECT = "JADWAL";

    private List<Kelas> kelasList;
    private List<Ruang> ruangList;
    private EkspresiContext ekspresi;

    public Translator(List<Kelas> kelasList, List<Ruang> ruangList) {
        this.kelasList = kelasList;
        this.ruangList = ruangList;
    }

    public void translate(String input) {
        SchedulingGrammarLexer lexer = new SchedulingGrammarLexer(new ANTLRInputStream(input));
        SchedulingGrammarParser parser = new SchedulingGrammarParser(new CommonTokenStream(lexer));
        ekspresi = parser.ekspresi();
    }

    private void runBuat() {
        SchedulingGrammarParser.EntitasContext entitas = ekspresi.entitas();

        switch (entitas.objek().getText()) {
            case KELAS_OJBECT:
                Kelas kelas = EntityBuilder.buildKelas(entitas);
                kelasList.add(kelas);
                System.out.println(kelas.toString());
                break;
            case RUANG_OJBECT:
                Ruang ruang = EntityBuilder.buildRuang(entitas);
                ruangList.add(ruang);
                System.out.println(ruang.toString());
                break;
            case JADWAL_OBJECT:
                break;
            default:
                break;
        }

    }

    private void runLihat() {
        SchedulingGrammarParser.EntitasContext entitas = ekspresi.entitas();
        switch (entitas.getText()) {
            case KELAS_OJBECT:
                if (kelasList.isEmpty()) {
                    System.out.println("Tidak ada kelas terdaftar");
                    break;
                }
                for (Kelas kelas : kelasList) {
                    System.out.println(kelas.toString());
                }
                break;
            case RUANG_OJBECT:
                if (ruangList.isEmpty()) {
                    System.out.println("Tidak ada ruang terdaftar");
                    break;
                }
                for (Ruang ruang : ruangList) {
                    System.out.println(ruang.toString());
                }
                break;
            case JADWAL_OBJECT:
                break;
            default:
                System.out.println("Objek tidak ditemukan.");
                break;
        }
    }

    public void runCommand() {
        try {
            switch (ekspresi.perintah().getText()) {
                case "BUAT":
                    runBuat();
                    break;
                case "LIHAT":
                    runLihat();
                    break;
                default:
                    System.out.println("Perintah tidak ditemukan.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Perintah tidak valid.");
        }

    }
}
