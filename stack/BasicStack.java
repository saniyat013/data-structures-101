package stack;

public class BasicStack {

    int a[] = new int[10];
    int top = -1;

    void push(int x) {
        if (top >= 9) {
            System.out.println("Stack is full");
        } else {
            a[++top] = x;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return a[top--];
        }
    }
    
    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return a[top];
        }
    }
    
    void print() {
        for(int x : a) {
            System.out.print(x + ", ");           
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        BasicStack myStack = new BasicStack();
        
//        myStack.print();
//        System.out.println(myStack.top);
//        
//        myStack.push(1);
//        myStack.print();
//        System.out.println(myStack.top);
//        
//        myStack.push(2);
//        myStack.push(3);
//        myStack.push(4);
//        
//        myStack.print();
//        System.out.println(myStack.top);
//        
//        System.out.println(myStack.pop());
//        myStack.print();
//        System.out.println(myStack.top);
//        
//        System.out.println("Current Value in TOP: " + myStack.peek());
//        
//        myStack.pop();
//        myStack.pop();
//        myStack.pop();
//        myStack.pop();
//        myStack.pop();
        
        myStack.push(1);
        System.out.println("Top: " + myStack.top);
        myStack.push(1);
        System.out.println("Top: " + myStack.top);
        myStack.push(1);
        System.out.println("Top: " + myStack.top);
        myStack.push(1);
        System.out.println("Top: " + myStack.top);
        myStack.push(1);
        System.out.println("Top: " + myStack.top);
        myStack.push(1);
        System.out.println("Top: " + myStack.top);
        myStack.push(1);
        System.out.println("Top: " + myStack.top);
        myStack.push(1);
        System.out.println("Top: " + myStack.top);
        myStack.push(1);
        System.out.println("Top: " + myStack.top);
        myStack.push(1);
        System.out.println("Top: " + myStack.top);
        myStack.push(1); //break
        System.out.println("Top: " + myStack.top);
        myStack.push(1);
        System.out.println("Top: " + myStack.top);
        myStack.push(1);
        System.out.println("Top: " + myStack.top);
    }
}
