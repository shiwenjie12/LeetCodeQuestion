package BitManipulation;

public class FindComplement {
    public static int findComplement(int num) {
        int ones = (Integer.highestOneBit(num) << 1) - 1;
        return num ^ ones;
    }

    public static void main(String[] args) {
        String expression = "expression*";
        String fromPrefix = expression.substring(0, expression.length() - 1);
        char[] toPrefixCharArr = fromPrefix.toCharArray();
        toPrefixCharArr[toPrefixCharArr.length - 1]++;
        String toPrefix = new String(toPrefixCharArr);

        findComplement(5);
    }
}
