public class charprint {
    public static void main(String[] args) {
        char x = 'A';
        char y = 'Z';
        for (int i = x; i <= y; i++){
            printSy(x,(char)i);
        }
    }
    public static void printSy(char fst, char end){
        for (int i = fst; i<= end; i++){
            System.out.print((char) i);
        }
        System.out.println();
    }
}
