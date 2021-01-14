package LeetCode.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class Q225 {
    Queue<Integer> q = null;

    /** Initialize your data structure here. */
    public Q225() {
        this.q = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q.offer(x);
        int size = q.size()-1;
        while((size--)!=0){
            q.offer(q.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.poll();
    }

    /** Get the top element. */
    public int top() {
        return q.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}
