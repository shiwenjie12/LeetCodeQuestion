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

    public static int romanToInt1(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            int num = getValue(s.charAt(i));
            if(num > preNum){
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }

    private static int getValue(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void  main(String[] args){
        romanToInt1("VI");
    }
}
