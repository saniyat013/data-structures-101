package stack;

import java.util.Stack;

public class Stack01 {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        
        String s = "We will conquere COVID-19";
        
        char[] c = s.toCharArray();
        
        for(char ch : c) {
            myStack.push(ch);
        }
        
        int len = myStack.size();
        for(int i = 0; i < len; i++) {
            System.out.print(myStack.pop());;
        }
    }
}
