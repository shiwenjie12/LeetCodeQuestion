public class ReverseVowels {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) return s;
        char[] ss = s.toCharArray();
        String yuanyin = "aeiouAEIOU";
        int i = 0,j = s.length() - 1;
        while (i < j){
            while (i < j && !yuanyin.contains(ss[i] + "")){
                i++;
            }
            while (i < j && !yuanyin.contains(ss[j] + "")){
                j--;
            }

            char temp = ss[i];
            ss[i] = ss[j];
            ss[j] = temp;
            i++;j--;
        }
        return new String(ss);
    }

    public static void main(String[] args) {
        String cc = new ReverseVowels().reverseVowels("hello");
    }
}
