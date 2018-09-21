public class NumDecodings_91 {
    public static int numDecodings(String s) {
        int n = s.length();
        int[] nums = new int[n + 1];

        nums[n] = 1;
        nums[n - 1] = s.charAt(n - 1) == '0' ? 0: 1;

        for (int i = n - 2; i >= 0; i--){
            if (s.charAt(i) == '0') continue;
            String s1 = s.substring(i,i+2);
            nums[i] = Integer.parseInt(s1) <= 26 && Integer.parseInt(s1) > 0? nums[i + 1] + nums [i + 2] : nums[i + 1];
        }
        return nums[0];
    }

    public static void main(String[] args) {
        numDecodings("00");
    }
}
