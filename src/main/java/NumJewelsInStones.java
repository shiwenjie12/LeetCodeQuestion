import java.util.HashMap;

public class NumJewelsInStones {
    public static int numJewelsInStones(String J, String S) {
        int result = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (map.get(ch) == null){
                map.put(ch,1);
            }else{
                int count = map.get(ch);
                map.put(ch,count + 1);
            }
        }
        for (int i = 0; i < J.length(); i++) {
            char ch = J.charAt(i);
            if (map.get(ch) != null)
                result = result + map.get(ch);
        }
        return result;
    }

    public static void main(String[] args) {
        int i = numJewelsInStones( "aA","aAAbbbb");
    }
}
