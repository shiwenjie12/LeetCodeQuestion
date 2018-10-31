package Hash;

import java.util.HashMap;

public class FirstUniqChar {
    public static int firstUniqChar(String s) {
        int res = -1;
        for (char ch = 'a'; ch <= 'z'; ch++){
            int index = s.indexOf(ch);
            if (index != -1 && index == s.lastIndexOf(ch)){
                res = res == -1?index:Math.min(index,res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
