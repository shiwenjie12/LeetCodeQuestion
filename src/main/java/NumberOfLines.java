public class NumberOfLines {
    public int[] numberOfLines(int[] widths, String S) {
        int line = 1;
        int temp = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            int width = widths[ch - 'a'];
            if (width + temp > 100) {
                line++;
                temp = width;
            } else {
                temp += width;
            }
        }
        return new int[]{line, temp};
    }
}
