public class RepeatedStringMatch_686 {
    public static int repeatedStringMatch(String A, String B) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        for (;sb.length() < B.length();i++) sb.append(A);
        if (sb.toString().indexOf(B) >= 0) return i;
        if (sb.append(A).toString().indexOf(B) >= 0) return i+1;
        return -1;
    }

    public static void  main(String[] args){
        String A = "aaaaaaaaaaaaaaaaaaaaaab", B = "ba";
        int result = repeatedStringMatch(A,B);
    }
}
