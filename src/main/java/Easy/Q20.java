package Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Q20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case '(':
                    stack.push(')');
                    break;
                default:
                    if( stack.isEmpty() || s.charAt(i) != stack.pop() ){
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}
