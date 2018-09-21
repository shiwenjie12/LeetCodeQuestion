public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        int index = 0;
        int size = strs.length;

        while (true){
            char temp = 0;
            for (int i = 0; i < size ; i++){
                String str = strs[i];
                if (str == null)
                    return "";
                if (str.length() <= index){
                    return str;
                }
                char ch = str.charAt(index);
                if (temp == 0){
                    temp = ch;
                }else{
                    if (temp != ch){
                        return str.substring(0,index);
                    }
                }
            }
            index++;
        }
    }

    public static void  main(String[] args){
        String cc = longestCommonPrefix(new String[]{"dog","racecar","car"});
    }
}
