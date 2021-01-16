package linkedlist;

class MyLinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAfter(Node prev, int data) {
        if (prev == null) {
            System.out.println("This node can't be null!");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prev.next;
        prev.next = newNode;
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
            n.next = newNode;
        }
    }

    void insertValues(int data[]) {
        head = null;
        for (int x : data) {
            append(x);
        }
    }

    void deleteAt(int position) {
        if (position < 1 || position > getSize()) {
            System.out.println("The position is not valid!");
            return;
        }

        if (position == 1) {
            head = head.next;
        } else {
            Node n = head;
            int index = 1;
            while (n != null) {
                if (index == position - 1) {
                    n.next = n.next.next;
                    return;
                }
                n = n.next;
                index++;
            }
        }
    }
    
    void insertAt(int position, int data) {
        if (position < 1 || position > getSize()) {
            System.out.println("The position is not valid!");
            return;
        }

        if (position == 1) {
            push(data);
        } else {
            Node n = head;
            int index = 1;
            while (n != null) {
                if (index == position - 1) {
                    Node newNode = new Node(data);
                    newNode.next = n.next;
                    n.next = newNode;
                    return;
                }
                n = n.next;
                index++;
            }
        }
    }

    int getSize() {
        int size = 0;
        if (head == null) {
            return 0;
        } else {
            Node n = head;
            while (n != null) {
                size++;
                n = n.next;
            }
            return size;
        }
    }

    void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

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

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.head = new Node(3);
        Node second = new Node(4);
        Node third = new Node(5);
        second.next = third;
        list.head.next = second;
        list.printList();

        list.push(1);
        list.printList();

        list.insertAfter(list.head, 2);
        list.printList();

        list.append(6);
        list.printList();

        System.out.println("Fresh List:");
        int temp[] = {1, 2, 3, 4, 5};
        list.insertValues(temp);
        list.printList();

        System.out.println("Size of LinkedList: " + list.getSize());

        list.deleteAt(50);
        list.printList();
        
        list.insertAt(1, 50);
        list.printList();
    }
}
