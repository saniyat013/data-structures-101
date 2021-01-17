package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue02 {
    public static void main(String[] args) {
        Queue<String> myQ = new LinkedList();
        String front;
        
        myQ.add("1");
        for (int i = 0; i < 10; i++) {
            front = myQ.poll();
            System.out.println(front);
            
            myQ.add(front + "0");
            myQ.add(front + "1");
            
        }
        
        System.out.println(myQ);
    }
}
