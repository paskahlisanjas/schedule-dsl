import dbmanager.DatabaseManager;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.SchedulingGrammarLexer;
import parser.SchedulingGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class SchedulingApplication {
    final static String DATABASE_PATH = "schedule.db";
    final static String cek = "BUAT KELAS IF7602 DENGAN FASILITAS = AC, MEJA, KURSI;";

    public static void main(String args[]) {
        SchedulingGrammarLexer lexer = new SchedulingGrammarLexer(new ANTLRInputStream(cek));
        SchedulingGrammarParser parser = new SchedulingGrammarParser(new CommonTokenStream(lexer));

        String str;

        str = parser.command().getText();
        System.out.println(str);

        SchedulingGrammarParser.EntityContext entity = parser.entity();
//        System.out.println(entity.KELAS().getText());
        System.out.println(entity.kode());

//        str = parser.entity().kode().getText();
//        System.out.println(str);

//        System.out.println(parser.);
    }
}
