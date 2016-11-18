import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
public class Hello
{
        public static void main (String[] args)
        {

//String input = "public static void main(String[] args) { }";
InputStream is=System.in;
Reader r=new InputStreamReader(is);

String st="";
while(!st.equals("q")){
    try{
 BufferedReader br=new BufferedReader(r);
 st=br.readLine();
//String file = "D:\\NetBeansProjects\\firstAntlr\\build\\classes\\test.ko";
//CharStream cs = new ANTLRFileStream(file);
CharStream cs = new ANTLRInputStream(st);
      HelloLexer lexer = new HelloLexer(cs);
      
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      HelloParser parser = new HelloParser(tokens);
ParseTree tree = parser.init(); // begin parsing at init rule
// print LISP-style tree
System.out.println(tree.toStringTree(parser));

      }catch(Exception e)
      {

         System.out.println("Error: "+e);
      }
}      
        }
}