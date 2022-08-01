public class Luckydraw {
    public static void main(String[] args) {
        int[] bag = init(64);
    }
    public static int[] init (int size){
        int[] out = new int[size];
        for (int i = 0; i < size; i++) {
            out[i] = i+1;
        }
        return out;
    }
}
