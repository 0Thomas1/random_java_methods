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
    public double std(double[] arr){
        if( arr.length == 0)
            return 0.0;
        double m = mean(arr);
        double sum = 0;
        for(int i = 0; i< arr.length;i++){
            sum+= Math.pow(arr[i]-m,2);
        }
        return Math.sqrt(sum/ arr.length);
    }

    private double mean(double[] arr) {
        double s = 0;
        for (double e : arr){
            s+= e;
        }
        return s/arr.length;
    }
}