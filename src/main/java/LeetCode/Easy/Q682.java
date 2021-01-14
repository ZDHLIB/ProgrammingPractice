package LeetCode.Easy;

import java.util.Stack;

public class Q682 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(String s : ops){
            switch (s){
                case "+":
                    Integer tmp = stack.peek();
                    Integer tmpS = stack.pop() + stack.peek();
                    stack.push(tmp);
                    stack.push(tmpS);
                    sum += tmpS;
                    break;
                case "D":
                    sum += 2 * stack.peek();
                    stack.push( 2 * stack.peek() );
                    break;
                case "C":
                    sum -= stack.pop();
                    break;
                default:
                    Integer score = Integer.valueOf(s);
                    sum += score;
                    stack.push(score);
            }
        }
        return sum;
    }
}
