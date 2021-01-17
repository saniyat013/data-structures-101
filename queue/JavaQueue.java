package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class JavaQueue {
    public static void main(String[] args) {
        Queue<String> myQ = new PriorityBlockingQueue();
        
        myQ.add("a");
        myQ.add("b");
        myQ.add("c");
        myQ.add("d");
        myQ.add("e");
        
        System.out.println(myQ.poll());
        System.out.println(myQ.poll());
        System.out.println(myQ.poll());
        System.out.println(myQ.poll());
        System.out.println(myQ.poll());
    }
}
