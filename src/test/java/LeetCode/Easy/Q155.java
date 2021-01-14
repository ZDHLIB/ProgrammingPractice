package LeetCode.Easy;

import java.util.Stack;

public class Q155 {
    private Stack<Integer> stack = null;
    private Stack<Integer> minStack = null;
    /** initialize your data structure here. */
    public Q155() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int x) {
        if(stack.isEmpty()){
            stack.push(x);
            minStack.push(x);
        }else {
            stack.push(x);
            if(x <= minStack.peek()){
                minStack.push(x);
            }
        }
    }

    public void pop() {
        Integer tmp = stack.pop();
        if(tmp.equals(minStack.peek())){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
