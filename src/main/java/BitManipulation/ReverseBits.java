package BitManipulation;

public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i <= 31; i++) {
            result += (1 & (n >> i)) << (31 - i);
        }
         return result;
    }
}
