package linkedlist;

class LinkedListString {

    Node head;

    static class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            next = null;
        }
    }

    void push(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAfter(Node prev, String data) {
        if (prev == null) {
            System.out.println("This node can't be null!");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prev.next;
        prev.next = newNode;
    }

    void insertAfterValue(String value, String data) {
        if (value.equals("")) {
            System.out.println("This value can't be null!");
            return;
        }
        Node n = head;
        while (n != null) {
            if (n.data.equals(value)) {
                Node newNode = new Node(data);
                newNode.next = n.next;
                n.next = newNode;
                return;
            }
            n = n.next;
        }
    }

    void append(String data) {
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

    void insertValues(String data[]) {
        head = null;
        for (String x : data) {
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

    void deleteByValue(String value) {
        if (value.equals("")) {
            System.out.println("This value can't be null!");
            return;
        }
        if (head.data.equals(value)) {
            head = head.next;
        } else {
            Node n = head;
            while (n.next != null) {
                if (n.next.data.equals(value)) {
                    n.next = n.next.next;
                    return;
                }
                n = n.next;
            }
            System.out.println("Given value not found!");
        }
    }

    void insertAt(int position, String data) {
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
        LinkedListString list = new LinkedListString();
        String values[] = {"banana", "mango", "grapes", "orange"};
        list.insertValues(values);
        list.printList();

        list.insertAfterValue("mango", "apple");
        list.printList();

        list.deleteByValue("orange");
        list.printList();

        list.deleteByValue("figs");
        
        list.deleteByValue("banana");
        list.printList();
        
        list.deleteByValue("mango");
        list.deleteByValue("apple");
        list.deleteByValue("grapes");
        list.printList();
    }
}
