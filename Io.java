import java.io.*;
public class Io{
    public static void main (String[] args)
            throws FileNotFoundException{
        File myFile = new File("test.txt");
        if (myFile.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }
        PrintWriter outPut = new PrintWriter(myFile);
        outPut.print("John T Smith ");
        outPut.println(90);
        outPut.print("Eric K Jones ");
        outPut.print(85);
        outPut.close();
    }
}