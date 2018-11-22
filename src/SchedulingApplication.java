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
import java.util.Scanner;

public class SchedulingApplication {
    final static String DATABASE_PATH = "schedule.db";

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
                SchedulingGrammarLexer lexer = new SchedulingGrammarLexer(new ANTLRInputStream(input.toString()));
                SchedulingGrammarParser parser = new SchedulingGrammarParser(new CommonTokenStream(lexer));
                SchedulingGrammarParser.EkspresiContext ekspresi = parser.ekspresi();

                SchedulingGrammarParser.EntitasContext entitas = ekspresi.entitas();

                Kelas kelas = (Kelas) EntityBuilder.build(entitas);
                System.out.println(kelas.toString());
            }
        } while (!input.toString().contains("STOP"));
    }



    public static void main(String args[]) {
//        runConsole();
    }
}
