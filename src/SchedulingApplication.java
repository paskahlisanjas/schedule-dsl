import dbmanager.DatabaseManager;
import entity.EntityBuilder;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.SchedulingGrammarLexer;
import parser.SchedulingGrammarParser;
import entity.Kelas;
import entity.Penjadwalan;
import entity.Ruang;

import java.util.ArrayList;
import java.util.List;

public class SchedulingApplication {
    final static String DATABASE_PATH = "schedule.db";
    final static String cek = "BUAT \n" +
            "    KELAS IF2402\n" +
            "DENGAN\n" +
            "    KEBUTUHAN = AC, PROYEKTOR, PAPAN-TULIS\n" +
            "    KAPASITAS = 59\n" +
            "    PREFERENSI = HARI SENIN JAM KE 1;";

    public static void main(String args[]) {
        SchedulingGrammarLexer lexer = new SchedulingGrammarLexer(new ANTLRInputStream(cek));
        SchedulingGrammarParser parser = new SchedulingGrammarParser(new CommonTokenStream(lexer));

        String str;

        SchedulingGrammarParser.EkspresiContext ekspresi = parser.ekspresi();

        SchedulingGrammarParser.EntitasContext entitas = ekspresi.entitas();

        Kelas kelas = (Kelas) EntityBuilder.build(entitas);
        System.out.println(kelas.toString());
    }
}
