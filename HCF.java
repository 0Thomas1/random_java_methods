public class HCF {
    public static void main(String[] args) {
        int num = getGCD(18,37);
    }

    private static int getGCD(int num1, int num2) {
       int i = Math.min(num1,num2);
       while (i>0){
           if(num1%i == 0&& num2%i ==0)
               return i;
       }
       return 1 ;
    }
}
