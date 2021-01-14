package hashmap;

import java.util.Arrays;

public class BasicHashTableCollision {
    
//    static class LinkedList {
//        Node head;
        
    static class Node {
            int data;
            Node next;
            
            Node(int data) {
                this.data = data;
                next = null;
            }
        }
        
//    }

    static class HashTable {

        Node table[] = new Node[10];
        
        HashTable() {
            for(int i = 0; i < table.length; i++) {
                table[i].data = -1;
            }
        }

        int getHash(String key) {
            char ch[] = key.toCharArray();
            int hash = 0;
            for (char c : ch) {
                hash += c;
            }
            return hash %= 10;
        }

        void insert(String key, int age) {
            if(table[getHash(key)] == -1) {
                table[getHash(key)] = age;
            } else {
                Node head = new Node(table[getHash(key)]);
                table[getHash(key)] = head;
            }         
        }

        int getValue(String key) {
            return table[getHash(key)];
        }

        void deleteValue(String key) {
            table[getHash(key)] = 0;
        }

        void printTable() {
            for (int x : table) {
                System.out.println(x);
            }
        }
    }

    public static void main(String[] args) {
        HashTable myTable = new HashTable();

        myTable.insert("DDC", 19);
        myTable.insert("ef", 20);
        myTable.insert("EEA", 21);
        myTable.insert("dg", 22);
        
        myTable.printTable();

    }
}
