import java.util.Stack;

// 使用两个Stack表示，一个stack作为输入，一个作为输出，
class MyQueue {
    private Stack<Integer> stackin;
    private Stack<Integer> stackout;
    /** Initialize your data structure here. */
    public MyQueue() {
        stackin = new Stack<>();
        stackout = new Stack<>();
    }
    /** Push element x to the back of queue. */
    public void push(int x) {
        stackin.push(x);
    }
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return stackout.pop();
    }
    /** Get the front element. */
    public int peek() {
        if (stackout.isEmpty()){
            while (!stackin.isEmpty()){
                stackout.push(stackin.pop());
            }
        }
        return stackout.peek();
    }
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackout.isEmpty() && stackin.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */