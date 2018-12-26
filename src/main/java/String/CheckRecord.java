package String;

public class CheckRecord {
    public boolean checkRecord(String s) {
        int flagA = 0;
        int flagL = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == 'A'){
                flagA++;
                flagL = 0;
                if (flagA > 1 || flagL >= 3){
                    return false;
                }
            }else if (ch == 'L'){
                flagL++;
                if (flagA > 1 || flagL >= 3){
                    return false;
                }
            }else{
                flagL = 0;
            }
        }
        return true;
    }
}
