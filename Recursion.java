public class Recursion {
    public static long[] fibCache;
    public static void main(String[] args) {
        int n = 64;
        fibCache =new long[n+1];
        System.out.println(fac(15));
        System.out.println(fib(n));
    }
    public static int fac(int n){
        if(n==2)
            return 2;
        return n* fac(n-1);
    }
    public static long fib(int n){
        if(n<=2)
            return 1;

        if(fibCache[n]!= 0)
            return fibCache[n];

        long nthFib =  fib(n-1) + fib(n-2);
        fibCache[n] = nthFib;

        return nthFib;
    }
}
