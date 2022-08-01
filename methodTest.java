import java.util.Scanner;
public class methodTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year");
        int year = in.nextInt();
        if (checkLeap(year)){
            System.out.println(year + " is a leap year!");
        }
        else {
            System.out.println(year + " is not a leap year!");
        }

    }
    public static Boolean checkLeap(int num) {
        return (num % 4 == 0 && num % 100 != 0) || (num % 100 == 0 && num % 400 == 0);
    }
}