public class TryMe{
    public static void main (String[] args) {
        // 4->1 stars each line 
        int i,j;
        for (i=5;i>=0;i--){
            for(j=1;j<=i;j++)
                System.out.print('*');
            System.out.print('\n');
        }
        // 1-> 4 each line
        int n = 5;
        for (i=1;i<=n;i++){
            for(j=1;j<=i;j++)
                System.out.print(j);
            System.out.print('\n');
        }

    }
}