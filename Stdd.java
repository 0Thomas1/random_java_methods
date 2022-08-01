import java.util.Scanner;

public class Stdd {
    public static void main(String[] args) {
        String myStr = "12 23 57 68 90";
        Scanner in = new Scanner(myStr);
        int count = count(in);
        System.out.println("count = " + count);

    }

    private static int count(Scanner in) {
        int c = 0;
        while (in.hasNextInt()){
            c++;
        }
        return c;
    }

    public static int mean(Scanner in, String str){
        return 7;
    }
}

/*
std = sqrt(sum((x-mean)^2)/n)
 */