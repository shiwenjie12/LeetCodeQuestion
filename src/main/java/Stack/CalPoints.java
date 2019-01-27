package Stack;

import java.util.Stack;

public class CalPoints {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            String str = ops[i];
            switch (str) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    int cc = stack.peek();
                    stack.push(cc * 2);
                    break;
                case "+":
                    int cc1 = stack.pop();
                    int cc2 = stack.pop();
                    stack.push(cc2);
                    stack.push(cc1);
                    stack.push(cc1 + cc2);
                    break;
                default:
                    int temp = Integer.valueOf(str);
                    stack.push(temp);
                    break;
            }
        }
        int sum = 0;
        while (!stack.empty()){
            sum = stack.pop() + sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        new CalPoints().calPoints(new String[]{"5","2","C","D","+"});
    }
}
