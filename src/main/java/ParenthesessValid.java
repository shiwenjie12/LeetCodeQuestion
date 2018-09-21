import java.util.Stack;

public class ParenthesessValid {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();

        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else{
                if (!st.empty()){
                    char ch1 = st.pop();
                    if ((ch1 == '(' && ch != ')') || (ch1 == '{' && ch != '}')||(ch1 == '[' && ch != ']'))
                        return false;
                }else{
                    return false;
                }

            }
        }
        if (!st.empty())
            return false;
        else
            return true;
    }

    public static void  main(String[] args){
        String ss = "]";
        boolean ee = isValid(ss);
    }
}
