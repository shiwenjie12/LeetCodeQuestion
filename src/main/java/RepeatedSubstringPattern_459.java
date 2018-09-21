public class RepeatedSubstringPattern_459 {
    public static boolean repeatedSubstringPattern(String s) {
        int l = s.length()/2;
        for (int i = l; i>0 ; i--){
            if (s.length() % i == 0){
                String str = s.substring(0,i);
                String temp = str;
                while (str.length() < s.length()){
                    str = str + temp;
                    if (str.equals(s.substring(0,str.length()))){
                        if (str.length() == s.length())
                            return true;
                    }else{
                        break;
                    }
                }

            }
        }
        return false;
    }

    public static void  main(String[] args){
        String s = "ababab";
        boolean result = repeatedSubstringPattern(s);
    }
}
