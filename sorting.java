import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] myArray = {1,0,3,2};
       selectionSort(myArray);

    }
    public static void selectionSort(int[] myArray){
        int min;
        for(int i = 0; i < myArray.length; i++){
            for (int j = i+1; j < myArray.length; j++){
                if(myArray[j]< myArray[i]){
                    min = myArray[j];
                    myArray[j]= myArray[i];
                    myArray[i] = min;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
    public static void bubbleSort(int[] myArray){

    }
    public static void insertionSort(int[]myArray){

    }

}
