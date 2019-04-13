package String;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        if (S.equals("")){
            return "";
        }
        char[] chars = S.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right){
            if (!Character.isLowerCase(chars[left]) && !Character.isUpperCase(chars[left])){
                left++;
                continue;
            }
            if (!Character.isLowerCase(chars[right]) && !Character.isUpperCase(chars[right])){
                right--;
                continue;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            right--;
            left++;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        new ReverseOnlyLetters().reverseOnlyLetters("a-bC-dEf-ghIj");
    }
}
