package String;

public class JudgeCircle {
    public boolean judgeCircle(String moves) {
        int i = 0;
        int j = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'R')
                i++;
            else if (ch == 'L')
                i--;
            else if (ch == 'U')
                j++;
            else if (ch == 'D')
                j--;
        }
        return i == 0 & j == 0;
    }
}
