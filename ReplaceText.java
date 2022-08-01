import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    //java ReplaceTest sourceFile targetfile oldString newString
    public static void main(String[] args) throws FileNotFoundException {


        String oldString = args[2];
        String newString = args[3];
        File outp = new File(args[1]);
        PrintWriter out = new PrintWriter(args[1]);
        Scanner in = new Scanner(new File(args[0]));
        String line;
        while(in.hasNextLine()){
            line = in.nextLine();
            line = line.replace(oldString,newString);
            out.println(line);
        }
        in.close();
        out.close();
    }
}
