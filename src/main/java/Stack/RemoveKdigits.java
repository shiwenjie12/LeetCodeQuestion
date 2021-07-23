package Stack;

public class RemoveKdigits {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < k; i++) {
            int idx = 0;
            for (int j = 1 ; j < sb.length() && sb.charAt(j) >= sb.charAt(j-1); j++) {
                idx++;
            }
            sb.delete(idx,idx + 1);
            while (sb.length() > 1 && sb.charAt(0) == '0') sb.delete(0,1);
        }
        return sb.toString();
    }
}
