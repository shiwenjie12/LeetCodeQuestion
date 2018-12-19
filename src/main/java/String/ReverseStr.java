package String;

import java.util.Arrays;

public class ReverseStr {
    public String reverseStr(String s, int k) {
        if (s == null || s.length() == 0)
            return "";
        if (s.length() == 1)
            return s;
        char[] chars = s.toCharArray();
        int i = 0;
        while (i < chars.length) {
            int start = i;
            int end = i + k;
            if (end > chars.length)
                end = chars.length;
            for (int j = start; (j < start + ((end - start) / 2)) && j < chars.length; j++) {
                swap(j, end - 1 - (j - start), chars);
            }
            i = i + 2 * k;
        }
        return new String(chars);
    }

    public void swap(int i, int j, char[] arr) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        new ReverseStr().reverseStr("abcdefg", 3);
    }
}
