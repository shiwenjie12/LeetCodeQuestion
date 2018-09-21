public class TitleToNumber {
    public static int titleToNumber(String s) {
        int[] nums = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            nums[i] = s.charAt(i) - 'A' + 1;
        }
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 26 + nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        titleToNumber("ZY");
    }
}
