package String;

public class RotateString {
    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A+A).indexOf(B)!=-1;
    }

    public static void main(String[] args) {
        new RotateString().rotateString("abcde", "cdeab");
    }
}
