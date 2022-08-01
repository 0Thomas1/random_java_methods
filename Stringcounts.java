public class Stringcounts {
    public static void main(String[] args) {
        String myString = "a train ran in rain";
        System.out.println(count(myString, 'a'));
        System.out.println(reverse("abcde"));
        System.out.println(isPalindrome("Dammit im mad"));
        System.out.println(removeSigns("Dammit I'm mad!"));
        System.out.println(reverseStringArr("this is a teat"));
    }
    public static int count(String str, char a){
        int c = 0;
        for (int i = 0; i < str.length(); i++){
            char tmp = str.charAt(i);
            if (tmp == a)
                c++;
        }
        return c;
    }
    public static String reverse (String str){
        String newString = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            newString += str.charAt(i);
        }
        return newString;
    }
    public static boolean isPalindrome(String str){
        String outString = reverse(removeSigns(str.toLowerCase()));
        System.out.println(outString);
        return removeSigns(str.toLowerCase()).equals(outString);
    }
    public static String removeSigns(String str){
        String outString="";
        int len = str.length();
        for (int i = 0; i <len ; i++) {
            char temp = str.charAt(i);
            if(isLetterOrNum(temp))
                outString += temp;
        }
        return outString;
    }
    public static boolean isLetterOrNum(char c){
        return (c>='A')&&(c<='Z')||(c>='a')&&(c<='z')||(c>='0')&&(c<='9');
    }
    public static String reverseStringArr(String str){
        String newString = "";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            newString+= reverse(arr[i]);
        }
        return newString;
    }
}
