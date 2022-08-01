import java.util.Scanner;
public class Control_flow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Example 1 
        System.out.print("Let x = ");
         int x = in.nextInt();
        if (x == 4.0){
            System.out.println("x = 4");
        }
        else{
            System.out.println("x != 4");
        }
        

        //Example 2;
        int n=12;
        if(n%2 == 0)
            System.out.println("n is an even number"); // if the function is only one line no {} needed
        else
            System.out.println("n is an odd number");

        // && = and ; || = or ; ! = not ;
        // T = True; F = False;

        int n1 = 5;
        int a = 1;
        int b = 2;
        int c = 13;
        if ((n1 % a == 0 || n1 % b == 0) && !(n1 % a == 0 && n1 % b == 0)) {
            System.out.println(n1 + "is divisible by " + a + " and "+ b + " or " + c);
        }
        else {
            System.out.println("IDK");
        }
    }

    
}
