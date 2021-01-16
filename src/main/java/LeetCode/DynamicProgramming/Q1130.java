package LeetCode.DynamicProgramming;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q1130 {
    public int mctFromLeafValues(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        int len = arr.length;
        stack.offerLast(Integer.MAX_VALUE);
        int res = 0;
        for(int num : arr){
            while(stack.peekLast() < num){
                int smallNum = stack.pollLast();
                res += smallNum * Math.min(stack.peekLast(), num);
            }
            stack.offerLast(num);
        }
        while(stack.size() > 2){
            res += stack.pollLast() * stack.peekLast();
        }
        return res;
    }
}
