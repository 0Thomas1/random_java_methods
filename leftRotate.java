import java.util.Arrays;

public class leftRotate {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int temp = myArray[0];
        for (int i = 0;i< myArray.length-1; i++){
            myArray[i]= myArray[i+1];
        }
        myArray[myArray.length-1] = temp;
        System.out.println(Arrays.toString(myArray));
    }
}
