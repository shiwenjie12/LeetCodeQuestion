package String;

public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int last, cur, res;
        last = res = 0;
        cur = 1;
        char[] chars = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            if (chars[i] == chars[i - 1]) cur++;
            else {
                last = cur;
                cur = 1;
            }
            if (last >= cur){
                System.out.println(cur + "  " + last);
                res++;
            }
        }
        return res;
    }
}
