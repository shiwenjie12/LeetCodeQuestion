import java.util.BitSet;

public class CountBits {
    public static int[] countBits(int num) {
        int[] f = new int[num + 1];
        for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
        return f;
    }

    public static void main(String[] args) {
        countBits(5);
        BitSet bt = new BitSet();
        bt.set(11);
        System.out.println(bt.get(11));
        System.out.println(bt.get(12));
    }
}
