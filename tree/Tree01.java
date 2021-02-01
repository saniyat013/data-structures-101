package tree;

import java.util.ArrayList;

public class Tree01 {

    static Node root;

    static class Node {

        String name;
        String designation;
        ArrayList<Node> children = new ArrayList();
        Node parent = null;

        Node(String name, String designation) {
            this.name = name;
            this.designation = designation;
        }

        void addChild(Node child) {
            this.children.add(child);
            child.parent = this;
        }

        ArrayList<Node> getChildren() {
            return children;
        }

        void printTree() {
            System.out.println(this.name + " (" + this.designation + ")");
            if (!this.children.isEmpty()) {
                for (Node n : this.getChildren()) {
                    System.out.print("  ->");
                    System.out.println(n.name + " (" + n.designation + ")");
//                    if (!n.children.isEmpty()) {
//                        for (Node c : n.getChildren()) {
//                            System.out.print("    ->");
//                            System.out.println(c.name + " (" + c.designation + ")");
//                        }
//                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        root = new Node("Nilupul", "CEO");

        Node chinmay = new Node("Chinmay", "CTO");
        Node vishwa = new Node("Vishwa", "Infrustructure Head");

        chinmay.addChild(vishwa);

        Node gels = new Node("Gels", "HR Head");
        Node peter = new Node("Peter", "Recruitment Manager");
        
        gels.addChild(peter);

        root.addChild(chinmay);
        root.addChild(gels);

        root.printTree();
    }
}
