public class rollDice {
    public static void main(String[] args) {
        int face = 0;
        int[] count = new int[6];
        for (int i = 1; i<=6000; i++){
            face = rollDice();
            count[face-1] += 1;
        }
        for (int j = 0; j < count.length; j++){
            System.out.println(j+1 +": " + count[j]);
        }
    }
    public static int rollDice(){
        return (int)(1+Math.random()*6);
    }
}
