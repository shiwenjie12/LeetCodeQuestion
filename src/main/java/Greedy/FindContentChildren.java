package Greedy;

import java.util.Arrays;

public class FindContentChildren {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int sindex = 0;
        for (int i = 0; i < g.length && sindex < s.length; i++) {
            if (s[sindex] >= g[i]) {
                result++;
                sindex++;
            } else {
                while (++sindex < s.length){
                    if (s[sindex] >= g[i]){
                        result++;
                        sindex++;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        findContentChildren(new int[]{10,9,8,7},new int[]{5,6,7,8});
    }
}
