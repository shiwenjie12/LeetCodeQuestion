package BitManipulation;

public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int cc = x ^ y;
        int cc1 = 1;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((cc & cc1) == 1){
                result++;
            }
            cc = cc >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int cc = 5 ^ 8;
        hammingDistance(1,4);
    }
}
