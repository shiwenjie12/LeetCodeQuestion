public class ReverseString {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseString().reverseString("abcd efgh"));
    }
}
