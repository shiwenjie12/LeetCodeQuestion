public class ShortestToChar {
    public static int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        int pos = S.length() - 1;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) pos = i;
            result[i] = Math.abs(i - pos);
        }
        pos = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == C) pos = i;
            result[i] = Math.min(result[i],Math.abs(i - pos));
        }
        return result;
    }

    public static void main(String[] args) {
        shortestToChar("loveleetcode",'e');
    }
}
