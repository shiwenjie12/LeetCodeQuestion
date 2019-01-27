package BitManipulation;

public class FindComplement {
    public static int findComplement(int num) {
        int ones = (Integer.highestOneBit(num) << 1) - 1;
        return num ^ ones;
    }

    public static void main(String[] args) {
        findComplement(5);
    }
}
