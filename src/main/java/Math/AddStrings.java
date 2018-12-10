package Math;

public class AddStrings {
    public static String addStrings(String num1, String num2) {
        int maxlength = Math.max(num1.length(), num2.length());
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;
        int flag = 0;
        char[] chars = new char[maxlength + 1];
        for (int i = maxlength; i > 0 ; i--) {
            int n1 = (index1 >= 0) ? (int) num1.charAt(index1) : (int) '0';
            int n2 = (index2 >= 0) ? (int) num2.charAt(index2) : (int) '0';
            int ch = n1 + n2 - 48 + flag;
            flag = 0;
            if (ch > 57) {
                flag = 1;
                ch -= 10;
            }
            chars[i] = (char) ch;
            index1--;
            index2--;
        }
        if (flag == 1){
            chars[0] = '1';
            return String.valueOf(chars);
        }else{
            return String.valueOf(chars,1,maxlength);
        }
    }

    public static void main(String[] args) {
        System.out.println(addStrings("88", "333"));
    }
}
