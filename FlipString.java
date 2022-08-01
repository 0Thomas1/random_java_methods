public class FlipString {
    public static void main(String[] args) {
        // "HEllo 1181 CpSc" flip upper to lower
        System.out.println(flip("HEllo 1181 CpSc"));
    }
    public static String flip (String str){
        String out = "";
        for(int i = 0; i< str.length();i++){
            char letter = str.charAt(i);
            if(letter>='a' && letter<='z'){
                letter = (char)(letter -'a'+'A');
            }
            else if (letter>='A' && letter<='Z') {
                letter = (char)(letter-'A'+'a');
            }
            out = out+letter;
        }
        return out;
    }

}
