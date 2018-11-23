package translator;

import entity.Kelas;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.SchedulingGrammarLexer;
import parser.SchedulingGrammarParser;
import parser.SchedulingGrammarParser.*;

public class Translator {
    private EkspresiContext ekspresi;

    public Translator(String input) {
        SchedulingGrammarLexer lexer = new SchedulingGrammarLexer(new ANTLRInputStream(input));
        SchedulingGrammarParser parser = new SchedulingGrammarParser(new CommonTokenStream(lexer));

        ekspresi = parser.ekspresi();
    }

    public Object runCommand() {

    }
}
