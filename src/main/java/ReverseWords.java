public class ReverseWords {
    public String reverseWords(String s) {
        char[] res = s.toCharArray();
        int start = 0, end = 0;
        while(start < res.length){
            end = s.indexOf(' ', start);
            if(end == -1){
                reverse(res, start, res.length - 1);
                break;
            }
            reverse(res, start, end - 1);
            start = end + 1;
        }
        return new String(res);
    }

    public void reverse(char[] w, int l, int r){
        while(l < r){
            char t = w[l];
            w[l] = w[r];
            w[r] = t;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        //String cc = reverseWords("Let's take LeetCode contest");
        boolean cc = isPowerOfTwo(8);
    }

    private static boolean isPowerOfTwo(int val) {
        byte[] cc = intToBytes(-7);
        int ee = -val;
        int rr = (val & -val);
        return (val & -val) == val;
    }
    /**
     * int转byte[]
     */
    public static byte[] intToBytes(int i) {
        byte[] bytes = new byte[4];
        bytes[0] = (byte) (i & 0xff);
        bytes[1] = (byte) ((i >> 8) & 0xff);
        bytes[2] = (byte) ((i >> 16) & 0xff);
        bytes[3] = (byte) ((i >> 24) & 0xff);
        return bytes;
    }
}
