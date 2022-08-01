import javax.lang.model.SourceVersion;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // create array 1-10
        int[] intArray = new int[10];
        for (int i= 0; i<intArray.length;i++){
            intArray[i] = i+1;
        }
        //print the array
        System.out.println(Arrays.toString(intArray));
        //or
        for (int number:intArray){
            System.out.print(number+ ",  ");
        }
        System.out.println();
        //print reverse order
        final int arrLen = intArray.length-1;
        for (int i = intArray.length-1; i>=0;i--) {
            System.out.print(intArray[i]+ ", ");
        }
        System.out.println();
        //sum all
        int sum = 0;
        for (int number :intArray){
            sum += number;
        }
        System.out.println("sum = " + sum);
        // average
        System.out.println("average = " + (double)sum/ intArray.length);
    }
}
