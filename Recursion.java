public class Recursion {
    public static void main(String[] args) {
        System.out.println(fac(15));
        System.out.println(fib(9));
    }
    public static int fac(int n){
        if(n==2)
            return 2;
        return n* fac(n-1);
    }
    public static int fib(int n){
        if(n<=2)
            return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void tower(){

    }
    public static void move(){

    }
}
/*
    1>B 2>C 1>C 3>B



    1
    2
    3
    A   B   C
 */