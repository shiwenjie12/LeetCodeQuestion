package String;

public class CountSegments {
    public int countSegments(String s) {
        if (s.length() == 0)
            return 0;
        boolean flag = true;
        int count = 0;
        for (char ch : s.toCharArray()){
            if (ch == ' ')
                flag = true;
            else{
                if (flag)
                    count++;
                flag = false;
            }
        }
        return count;
    }
}
