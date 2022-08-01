public class countNumOfDigits {
    public static void main(String[] args) {
        int n = 123456789;
        int nofd = 0;
        while (n>=1){
            n/=10;
            nofd += 1;
        }
        System.out.println(nofd);
    }
}
