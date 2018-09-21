import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;
        int index = 0;
        while (index < s.length()){
            char ch = s.charAt(index);
            int ss = 0;
            if (ch == 'I'){
                if (index + 1 < s.length()){
                    char rear = s.charAt(index+1);
                    if ((rear == 'V' || rear == 'X')){
                        ss = map.get(rear) - map.get(ch);
                        index++;
                    }
                }
            }else if (ch == 'X'){
                if (index + 1 < s.length()){
                    char rear = s.charAt(index+1);
                    if (rear == 'L' || rear == 'C'){
                        ss = map.get(rear) - map.get(ch);
                        index++;
                    }
                }
            }else if (ch == 'C'){
                if (index + 1 < s.length()){
                    char rear = s.charAt(index+1);
                    if (rear == 'D' || rear == 'M'){
                        ss = map.get(rear) - map.get(ch);
                        index++;
                    }
                }
            }
            if (ss == 0){
                ss = map.get(ch);
            }
            result = result + ss;
            index++;
        }
        if (result > 3999)
            return 0;
        return result;
    }

    public static void  main(String[] args){
        romanToInt("LVIII");
    }
}
