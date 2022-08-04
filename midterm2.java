public class midterm2 {
    public static void main(String[] args) {
        int[] test = {6,8,8,8,8,7,6,6,5,4,3};
        countD(test);
        System.out.println(myParseInt("190"));
        System.out.println(myParseDub("123.456"));
    }
    public static boolean isPattern(int[] arr){
        int count=0;
        int tmp;
        int i =0;
        while (i < arr.length) {
            tmp = arr[i];
            count=0;
            while (i < arr.length && tmp == arr[i]) {
                count++;
                i++;
            }
        }
        return count == 4;
    }
    public static int[] removeKey(int[] arr, int key){
        int count = 0;
        for(int e : arr){
            if(e == key)
                count++;
        }
        int[] out = new int[arr.length-count];
        if(out.length == 0)
            return null;
        for (int i = 0, j = 0; i < arr.length;i++){
            if (arr[i] != key) {
                out[j] = arr[i];
                j++;
            }
        }
        return out;
    }
    public static void countD(int[] arr){
        int[] freq= new int[10];
        for(int e: arr){
            countDig(e,freq);
        }
        printFreq(freq);
    }

    private static void printFreq(int[] freq) {
        for(int i = 0; i < freq.length; i++){
            if(freq[i]!=0){
                System.out.printf("Digit %d : %d\n", i, freq[i]);

            }
        }
    }

    public static void countDig(int n, int[] count){
       while(n>0){
           count[n%10] +=1;
           n/=10;
       }
    }
    public static int myParseInt(String num){
        int n = 0;
        for (int i = 0; i < num.length(); i++) {
            n = n * 10 + num.charAt(i)-'0';
        }
        return n;
    }
    public static double myParseDub(String num){
        double n = 0.0;
        int i = 0;
        while (num.charAt(i)!='.'){
            n = n*10.0 + num.charAt(i)-'0';
            i++;
        }
        int dec = i+1;
        while (dec< num.length()){
            n += (num.charAt(dec)-'0')/Math.pow(10,dec-i);
            dec++;
        }
        return n;
    }
}
