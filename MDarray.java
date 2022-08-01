import java.util.Arrays;

public class MDarray {
    public static void main(String[] args) {
        int[][] arr = new int[5][6];
        initArr(arr);
        int sum = sumArr(arr);
        build(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    private static int sumArr(int[][] arr) {
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }

        return sum;
    }

    public static void initArr (int[][] arr){
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= n;
                n++;
            }

        }
    }
    public static void build (int[][] arr){
        int count = 1;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j][i] = count;
                count++;
            }
        }
    }
    public int sumOfRow (int[] arr){
        int sum = 0;
        for(int num:arr){
            sum+= num;
        }
        return sum;
    }
    public int[] sumOfRows (int[][] arr){
        int[] out = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            out[i] = sumOfRow(arr[i]);
        }
        return out;
    }
}
