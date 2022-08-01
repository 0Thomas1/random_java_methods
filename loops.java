public class loops {
    public static void main(String[] args) {
        // Write a while loop to add all number from [1, 1000]
        int sum = 0;

        /*for (i =1; i <= 1000; i++) {
            sum += i;
            System.out.println(sum);
        }*/
        // Write a while loop to add all odd number from [1, 1000] and print the result
        int sumEx2 = 0;
        int iEx2 = 1;

        while (iEx2 <= 100) {
            sumEx2 += iEx2;
            iEx2 += 2;
            System.out.println(sumEx2);
        }
        // Write a while loop to print all numbers from [1,1000] that are divisible by 5 & 7 and print it
        int iEx3 = 1;
        while (iEx3 <= 1000){
            if (iEx3 % 5 == 0 && iEx3 % 7 == 0){
                System.out.println(iEx3);
            }
            iEx3 +=1;
        }
        // ex 1 ->1000 % 5 !%21
    
        int iEx4 = 1;
        while (iEx4<=1000) {
            if (iEx4%5 == 0 && iEx4 % 21 != 0) {
                System.out.println(iEx4);
            }
            iEx4 += 1;
        }

        // ex5
        double y5 = 1.62;
        int i5 = 1;
        double x5 = 0;
        while (i5 <=1000) {
            x5 += Math.pow(y5, i5) / i5;
            System.out.println(x5);
            i5 += 1;
        }
        // ex5 for loop
        int i;
        for (i = 5; i <= 1000; i+=1) {
            x5 += Math.pow(y5, i5) / i5;
            System.out.println("for " + x5);
        }
        // 1 2 3 4 5 6 7 8 9 10
        int iL = 1;
        int jL = 1;
        int nL = 8;
        int sumL;

        while (iL <= nL) {
            sumL = 0;
            while (jL <= iL) {
                sumL += jL;
                jL+=1;
            }
            System.out.println("\nSum of 1 to " + iL + "=" + sumL);
            iL+=1;
        }


        }
    }

