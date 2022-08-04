/**
 * lucky draw program where there is no replacement
 */

import java.util.Arrays;

public class Luckydraw {
    public static void main(String[] args) {
        int size = 10;
        int draws = 4;
        int[] bag = init(size);
        for (int i = size; i >size - draws; i--) {
            System.out.println(draw(bag,i));
            System.out.println(Arrays.toString(bag));

        }
    }

    /**
     * initiate the bag
     * @param size size of the bag
     * @return initiated bag
     */
    public static int[] init (int size){
        int[] out = new int[size];
        for (int i = 0; i < size; i++) {
            //out[i] = i;
            out[i] = (int) (1+ Math.random()*size);
        }
        return out;
    }
    public static int draw(int[] arr,int end){
        int index = (int)(Math.random() * (end)-1);
        swap(arr,index, end-1);
        return arr[end-1];
    }
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] =arr[j];
        arr[j] = tmp;
    }
}
