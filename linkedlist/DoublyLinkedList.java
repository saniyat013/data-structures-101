package linkedlist;

public class DoublyLinkedList {

    Node head;

    static class Node {
        int data;
        Node prev, next;
        
        Node(int data) {
            this.data = data;
            prev = next = null;
        }
    }
    
    void append(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            Node newNode = new Node(data);
            newNode.prev = n;
            n.next = newNode;
        }
    }
    
    void printForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        System.out.print("Forward List: ");
        
        Node n = head;       
        while (n != null) {
            if (n.next == null) {
                System.out.print(n.data);
            } else {
                System.out.print(n.data + "-->");
            }
            n = n.next;
        }
        System.out.println("");
    }
    
    void printBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        System.out.print("Backward List: ");
        
        Node n = head;      
        while(n.next != null) n = n.next;
        
        while(n != null) {
            if (n.prev == null) {
                System.out.print(n.data);
            } else {
                System.out.print(n.data + "-->");
            }
            n = n.prev;
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        
        list.printForward();
        list.printBackward();
    }
}
