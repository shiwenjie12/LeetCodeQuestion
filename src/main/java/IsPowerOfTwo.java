public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n < 1) return false;
        n = n & (n-1);
        return n == 0;
    }

    public static void main(String[] args) {
        boolean cc = isPowerOfTwo(16);
    }
}
