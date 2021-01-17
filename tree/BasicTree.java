package tree;

import java.util.ArrayList;

public class BasicTree {
    
    static Node root;
    
    static class Node {
        int data;
        ArrayList<Node> child = new ArrayList<>();
        Node parent = null;
        
        Node (int data) {
            this.data = data;           
        }
        
        void addChild(Node child) {
            root.child.add(child);
        }
    }
    
    public static void main(String[] args) {
        root = new Node(1);
        Node second = new Node(2);
        root.addChild(second);
        Node third = new Node(3);
        root.addChild(third);
        
        System.out.println(root.data);
        System.out.println(root.child.get(0).data);
        System.out.println(root.child.get(1).data);
    }
    
}
