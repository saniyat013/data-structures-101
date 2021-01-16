package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack02 {

    static boolean isBalanced(String s) {
        Deque<Character> myStack = new ArrayDeque();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                myStack.push(c);
            } else if (c == ')') {
                if (myStack.isEmpty() || myStack.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                if (myStack.isEmpty() || myStack.pop() != '{') {
                    return false;
                }
            } else if (c == ']') {
                if (myStack.isEmpty() || myStack.pop() != '[') {
                    return false;
                }
            }           
        }
        return (myStack.isEmpty());
    }

    public static void main(String[] args) {
//        String s = "[a+b]*(x+2y)*{gg+kk}";
//        String s = "({a+b})";
//        String s = "))((a+b}{";
//        String s = "((a+b))";
        String s = "))";
        System.out.println(isBalanced(s));
    }
}
