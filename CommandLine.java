public class CommandLine {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println(" run as name, age, and date.");
            return;
        }
        for(String e: args){
            System.out.println(e);
        }
    }
}
