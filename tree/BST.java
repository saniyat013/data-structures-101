package tree;

public class BST {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }

        void addChild(int data) {
            if (data == this.data) {
                return;
            }
            if (data < this.data) {
                if (this.left != null) {
                    this.left.addChild(data);
                } else {
                    this.left = new Node(data);
                }
            } else {
                if (this.right != null) {
                    this.right.addChild(data);
                } else {
                    this.right = new Node(data);
                }
            }
        }

        void printInOrder() {
            if (this.left != null) {
                this.left.printInOrder();
            }
            System.out.print(this.data + ", ");
            if (this.right != null) {
                this.right.printInOrder();
            }
        }
        
        

        static Node buildTree(int[] elements) {
            Node root = new Node(elements[0]);

            for (int i = 1; i < elements.length; i++) {
                root.addChild(elements[i]);
            }

            return root;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {17, 4, 1, 20, 9, 23, 18, 34, 18, 4};
        Node numbersTree = Node.buildTree(numbers);
        numbersTree.printInOrder();
    }
}
