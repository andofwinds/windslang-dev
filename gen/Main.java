import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static String Windname = "mainWind";

    public static void main(String[] args) throws Exception {
        windsLexer lexer = new windsLexer(CharStreams.fromFileName(Windname + "/Winds/source/main.wind") );
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        windsParser parser = new windsParser(tokens);
        ParseTree tree = parser.cmdLine();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( new windsWalker(), tree );
    }
}
