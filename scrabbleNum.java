public class scrabbleNum {
    public static void main(String[] args){
        System.out.println(getDigit(1234,4));
    }
    public static int getNumOfDigits(int n){
        int k = 0;
        while (n>=1){
            n /= 10;
            k++;
        }
        return k;
    }
    public static int getDigit(int number, int digitNumber){
        for (int i = 0; i <= digitNumber-2; i++){
            number /= 10;
        }
        number%= 10;
       return number;
    }
}
