public class LargestPalindrome {
    public int largestPalindrome(int n) {
        if (n == 1)
            return 9;
        int upper = (int) Math.pow(10, n) - 1;
        for (int i = upper; i > upper / 10; i--) {
            long palindron = GetPalindrom(i);
            System.out.println(palindron);
            for (int j = upper; j > upper / 10; j--) {
                if (palindron / j > upper)
                    break;
                if (palindron % j == 0)
                    return (int) (palindron % 1337);
            }
        }
        return -1;
    }

    public long GetPalindrom(int i) {
        StringBuilder sb = new StringBuilder().append(i);
        sb.reverse();
        return Long.parseLong(i + sb.toString());
    }

    public static void main(String[] args) {
        new LargestPalindrome().largestPalindrome(3);
    }
}
