import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter file name");
        String inputFile = read.next()+".cl";
        String outputFileName = inputFile.substring(
                0, inputFile.lastIndexOf('.')
        );

        CharStream input = CharStreams.fromFileName(inputFile);
        CoolLexer lexer = new CoolLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        List<Token> allTokens = tokens.getTokens();

        Boolean err = false ;
        for (int i = 0 ; i < allTokens.size() ; i++){
            if (allTokens.get(i).getType() == 52) {
                err = true ;
                System.out.println("Error in line : "
                        +allTokens.get(i).getLine()
                        +"\n");
            }
        }
        String treeoutput="";
        if(!err){
            writeUsingBufferedWriter(outputFileName+".cl-lex",allTokens, allTokens.size());

            CoolParser parser = new CoolParser(tokens);
            ParseTree tree = parser.program();
            treeoutput+=(tree.toStringTree(parser));
            PrintWriter writer =new PrintWriter("treeoutput.txt","UTF-8");
            writer.println(treeoutput);
            writer.close();

        }


    }

    private static void writeUsingBufferedWriter(String fileName, List<Token> tokens, int nol) {
        File file = new File(fileName);
        FileWriter fr = null;
        BufferedWriter br = null;
        String newLineData ="" ;
        try{
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for(int i = nol; i>0; i--){
                newLineData +=
                        "Line : " + tokens.get(nol-i).getLine() +
                                "< Type : " + tokens.get(nol-i).getType() +
                                ", Value : " + tokens.get(nol-i).getText() + " >" ;
                br.write(newLineData);
                br.newLine();
                newLineData = "" ;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}