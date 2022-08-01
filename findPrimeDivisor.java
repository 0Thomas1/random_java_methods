// NOT FINISHED
public class findPrimeDivisor {
    public static void main(String[] args){
        int n = 12;
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if (n % i == 0) { //factors
                for (int j = 1; j < i; j++) { //check factors of factors
                    if ((i % j != 0)||((i % j)%2 != 0)){
                        System.out.println(j);
                    }

                }
            }
        }
    }
}
