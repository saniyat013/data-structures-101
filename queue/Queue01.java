package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Queue01 {

    static String items[];
    static Queue<String> pq;

    static class PlaceOrder extends Thread {

        PlaceOrder(String itemSent[]) {
            items = itemSent;
            pq = new LinkedList();
        }

        @Override
        public void run() {

            for (String item : items) {
                try {
                    pq.add(item);
                    System.out.println(item + " added to the queue");
                    sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Queue01.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    static class ServeOrder extends Thread {

        @Override
        public void run() {
            while (!pq.isEmpty()) {
                try {
                    sleep(2000);
                    System.out.println(pq.remove() + " is served");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Queue01.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void main(String[] args) {
        String itemSent[] = {"pizza", "samosa", "pasta", "biryani", "burger"};
        PlaceOrder orders = new PlaceOrder(itemSent);
        orders.start();

        ServeOrder served = new ServeOrder();
        served.start();
    }

}
