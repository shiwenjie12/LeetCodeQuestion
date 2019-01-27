package String;

public class ValidPalindrome {
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;
        int flag = 0;
        int bl = 0, br = 0;
        while (l <= r) {
            if (chars[l] == chars[r]) {
                l++;
                r--;
            } else {
                if (flag == 0) {
                    bl = l;
                    br = r;
                    l++;
                    flag++;
                } else if (flag == 1) {
                    l = bl;
                    r = br;
                    r--;
                    flag++;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
