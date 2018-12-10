package Hash;

import java.util.*;

public class FindAnagrams {
    public static List<Integer> findAnagrams(String s, String p) {
        int[] pchars = new int[26];
        for (char ch : p.toCharArray()) {
            pchars[ch - 'a'] = pchars[ch - 'a'] + 1;
        }
        int pl = p.length();
        List<Integer> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i <= chars.length - pl; i++) {
            int[] temp = Arrays.copyOf(pchars,pchars.length);
            boolean flag = true;
            for (int j = i; j < i + pl; j++) {
                char ch = chars[j];
                int count = temp[ch - 'a'];
                if (count == 0){
                    flag = false;
                    break;
                }
                temp[ch - 'a'] = count - 1;
            }
            if (flag){
                result.add(i);
            }
        }
        return  result;
    }

    public static List<Integer> findAnagrams1(String s, String p) {
        List<Integer> ans = new ArrayList<Integer>();
        if (s == null || s.length() == 0 || s.length() < p.length()) {
            return ans;
        }
        char[] strP = p.toCharArray();
        char[] strS = s.toCharArray();
        int[] chS = new int[123];
        int[] chP = new int[123];

        for (int i = 0; i < strP.length; i++) {
            chP[strP[i]]++;
            chS[strS[i]]++;
        }
        for (int i = 0; i <= strS.length - strP.length; i++) {
            boolean flag = true;
            if (i > 0) {
                chS[strS[i - 1]]--;
                chS[strS[i - 1 + strP.length]]++;
            }
            for (char j = 'a'; j <= 'z'; j++) {
                if (chS[j] != chP[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans.add(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        findAnagrams1("cbaebabacd","abc");
    }
}
