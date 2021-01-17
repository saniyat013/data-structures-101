package queue;

public class ArrayQueue {
    static class BasicQueue {
        int queue[];
        int front, rear, capacity;
        
        BasicQueue(int size) {
            this.capacity = size;
            queue = new int[capacity];
            front = rear = 0;
        }
        
        void enqueue(int data) {
            if(rear >= capacity) {
                System.out.println("Queue is full");
            } else {
                queue[rear++] = data;
            }
        }
        
        int dequeue() {
            if(front == rear) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int temp = queue[front];
                for (int i = 0; i < rear - 1; i++) {
                    queue[i] = queue[i+1];
                }
                if(rear < capacity)
                    queue[rear] = 0;
                rear--;
                return temp;
            }
        }
        
        void print() {
            if(front == rear) {
                System.out.println("Queue is empty");
            } else {
                for (int i = front; i < rear; i++) {
                    System.out.print(queue[i] + " -> ");
                }
                System.out.println("");
            }
        }
    }
    
    public static void main(String[] args) {
        BasicQueue myQueue = new BasicQueue(10);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        
//        myQueue.print();
        
//        System.out.println("Dequeued: " + myQueue.dequeue());
//        System.out.println("Dequeued: " + myQueue.dequeue());
        
//        myQueue.print();
        
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        myQueue.enqueue(8);
        myQueue.enqueue(9);
        myQueue.enqueue(10);
        myQueue.enqueue(11);
        myQueue.print();
        
    }
}
