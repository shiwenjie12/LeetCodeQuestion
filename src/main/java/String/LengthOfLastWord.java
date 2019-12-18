package String;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.length() < 2) {
            return s.length();
        }
        int index = s.lastIndexOf(" ");
        return index == -1 ? s.length() : (s.length() - index - 1);
    }

    public static void main(String[] args) {
        new LengthOfLastWord().lengthOfLastWord("qweq");
    }
}
