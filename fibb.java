import java.util.Scanner;
public class fibb {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int st = 0;
        int nd = 1;
        int counter = 1;
        int fib = 1;
        while((n >= counter) && (fib > 0)){
            fib = st + nd;
            System.out.print(fib + ", ");
            st = nd;
            nd = fib;
            counter += 1;
        }
        System.out.println("\n");
        System.out.println("stop at " + counter);
    }
}
