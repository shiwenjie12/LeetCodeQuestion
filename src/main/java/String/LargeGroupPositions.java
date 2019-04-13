package String;

import java.util.ArrayList;
import java.util.List;

public class LargeGroupPositions {
    public List<List<Integer>> largeGroupPositions(String S) {
        char[] chars = S.toCharArray();
        List<List<Integer>> result = new ArrayList<>();
        int first = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[first] != chars[i]) {
                List<Integer> list = new ArrayList<>(2);
                if ((i - 1) - first >= 2) {
                    list.add(first);
                    list.add(i - 1);
                    result.add(list);
                }
                first = i;
            }
        }
        if (chars[chars.length - 1] == chars[first]){
            if ((chars.length - 1) - first >= 2) {
                List<Integer> list = new ArrayList<>();
                list.add(first);
                list.add(chars.length - 1);
                result.add(list);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new LargeGroupPositions().largeGroupPositions("aaa");
    }
}
