
public class changeCase {
    public static void main(String[] args) {
        System.out.println(changeToLow('A') );
    }
    public static char changeToUp(char x){
        if(((int) x >= 'a')&&((int) x <= 'z')){
            return (char)(x -('a'-'A'));
        }
        else return x;
    }
    public static char changeToLow(char x){
        if(((int) x >= 'A')&&((int) x <= 'Z')){
            return (char)(x-'A'+'a');
        }
        else return x;
    }
}
