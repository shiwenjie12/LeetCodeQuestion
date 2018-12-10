package Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindWords {
    public static String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        HashSet<Character> set1 = new HashSet();
        HashSet<Character> set2 = new HashSet();
        HashSet<Character> set3 = new HashSet();
        set1.add('q');set1.add('w');set1.add('e');set1.add('r');set1.add('t');set1.add('y');set1.add('u');set1.add('i');set1.add('o');set1.add('p');
        set2.add('a');set2.add('s');set2.add('d');set2.add('f');set2.add('g');set2.add('h');set2.add('j');set2.add('k');set2.add('l');
        set3.add('z');set3.add('x');set3.add('c');set3.add('v');set3.add('b');set3.add('n');set3.add('m');
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            int flag = 0;
            boolean fail = false;
            for (int j = 0; j < str.length(); j++) {
                char ch = Character.toLowerCase(str.charAt(j));
                if (flag == 0){
                    if (set1.contains(ch))
                        flag = 1;
                    else if (set2.contains(ch))
                        flag = 2;
                    else
                        flag = 3;
                }else{
                    if (set1.contains(ch) && flag != 1){
                        fail = true;
                        break;
                    }
                    if (set2.contains(ch) && flag != 2){
                        fail = true;
                        break;
                    }
                    if (set3.contains(ch) && flag != 3){
                        fail = true;
                        break;
                    }
                }

            }
            if (!fail)
                list.add(str);
        }
        String[] array = new String[list.size()];
        return list.toArray(array);
    }

    public static void main(String[] args) {
        findWords(new  String[]{"a","b"});
    }
}
