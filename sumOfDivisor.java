public class sumOfDivisor {
    public static void main(String[] args){
        int n = 45;
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
                System.out.print(i+ ", ");
            }
        }
        System.out.println("\n");
        System.out.println(sum);
    }
}
