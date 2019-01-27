package BitManipulation;

public class HasAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int cc = 32 - Integer.numberOfLeadingZeros(n);
        boolean[] flags = new boolean[cc];
        for (int i = 0; i < cc; i++) {
            int c = 1 << i;
            flags[i] = ((n & c) != 0);
        }
        for (int i = 1; i < flags.length; i++) {
            if (flags[i] == flags[i - 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new HasAlternatingBits().hasAlternatingBits(10));
    }
}