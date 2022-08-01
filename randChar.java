public class randChar {
    public static void main(String[] args){
        for (int i = 0; i<=30; i++)
            System.out.println(getRandChar());
    }
    public static char getRandChar(){
        return (char)('a' + (Math.random()* ('z' - 'a' + 1)));
    }
}

