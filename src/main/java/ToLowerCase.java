public class ToLowerCase {
    public static String toLowerCase(String str) {
        int length = str.length();
        if (length == 0){
            return str;
        }
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch < 'a' && ch >= 'A'){
                ch = (char) (ch + 32);
            }
            result[i] = ch;
        }
        return new String(result);
    }

    public static void main(String[] args) {
        toLowerCase("al&phaBET");
    }
}
