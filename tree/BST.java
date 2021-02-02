package tree;

public class BST {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }

//        Add Children to the tree
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

//        In order traversal
        void printInOrder() {
            if (this.left != null) {
                this.left.printInOrder();
            }
            System.out.print(this.data + ", ");
            if (this.right != null) {
                this.right.printInOrder();
            }
        }

//        Pre oder traversal
        void printPreOrder() {
            System.out.print(this.data + ", ");
            if (this.left != null) {
                this.left.printPreOrder();
            }
            if (this.right != null) {
                this.right.printPreOrder();
            }
        }

//        Post order traversal
        void printPostOrder() {
            if (this.left != null) {
                this.left.printPostOrder();
            }
            if (this.right != null) {
                this.right.printPostOrder();
            }
            System.out.print(this.data + ", ");
        }

//        Search for a data
        boolean search(int data) {
            if (data == this.data) {
                return true;
            }
            if (data < this.data) {
                if (this.left == null) {
                    return false;
                } else {
                    return this.left.search(data);
                }
            } else {
                if (this.right == null) {
                    return false;
                } else {
                    return this.right.search(data);
                }
            }
        }

//        Find the minimum value
        int find_min() {
            if(this.left == null) {
                return this.data;
            } else {
                return this.left.find_min();
            }
//            Node temp = this;
//            while (temp.left != null) {
//                temp = temp.left;
//            }
//            return temp.data;
        }

//        Find the maximum value
        int find_max() {
            if(this.right == null) {
                return this.data;
            } else {
                return this.right.find_max();
            }
//            Node temp = this;
//            while (temp.right != null) {
//                temp = temp.right;
//            }
//            return temp.data;
        }

    }

//        Build the initial tree
    static Node buildTree(int[] elements) {
        Node root = new Node(elements[0]);

        for (int i = 1; i < elements.length; i++) {
            root.addChild(elements[i]);
        }

        return root;
    }

//        Find the sum of all the nodes
    static int calculateSum(Node temp) {
        if (temp == null) {
            return 0;
        }
        return temp.data + calculateSum(temp.left) + calculateSum(temp.right);
    }

    public static void main(String[] args) {
        int[] numbers = {15, 12, 7, 14, 27, 20, 23, 88};
        Node numbersTree = buildTree(numbers);
        numbersTree.printInOrder();
        System.out.println("");

        System.out.println(numbersTree.search(109));

        System.out.println("Min value: " + numbersTree.find_min());
        System.out.println("Max value: " + numbersTree.find_max());

        System.out.println("Total Sum: " + calculateSum(numbersTree));

        System.out.print("In order traversal: ");
        numbersTree.printInOrder();
        System.out.println("");
        System.out.print("Pre order traversal: ");
        numbersTree.printPreOrder();
        System.out.println("");
        System.out.print("Post order traversal: ");
        numbersTree.printPostOrder();
        System.out.println("");
    }
}
