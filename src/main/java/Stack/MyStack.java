package Stack;

import java.util.LinkedList;

public class MyStack {

    private LinkedList<Integer> linkedList = new LinkedList<>();

    /**
     * Initialize your data structure here.
     */
    public MyStack() {

    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        linkedList.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return linkedList.pollLast();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return linkedList.peekLast();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return linkedList.size() == 0;
    }
}
