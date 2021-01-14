package hashmap;

public class BasicHashTable {

    static class HashTable {

        int table[] = new int[10];

        int getHash(String key) {
            char ch[] = key.toCharArray();
            int hash = 0;
            for (char c : ch) {
                hash += c;
            }
            return hash %= 10;
        }

        void insert(String key, int age) {
            table[getHash(key)] = age;
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

        myTable.insert("saniyat", 25);
        myTable.insert("yeamin", 19);
        myTable.insert("tajsi", 9);
        
        myTable.printTable();

        System.out.println("Age of tajsi: " + myTable.getValue("tajsi"));
        System.out.println("Age of saniyat: " + myTable.getValue("saniyat"));
        System.out.println("Age of yeamin: " + myTable.getValue("yeamin"));

        myTable.deleteValue("yeamin");
        myTable.printTable();
        
        System.out.println("Age of tajsi: " + myTable.getValue("tajsi"));
        System.out.println("Age of saniyat: " + myTable.getValue("saniyat"));
        System.out.println("Age of yeamin: " + myTable.getValue("yeamin"));
        
        myTable.insert("tayek", 59);
        myTable.insert("salma", 49);
        
        myTable.printTable();
        
        System.out.println("Age of tajsi: " + myTable.getValue("tajsi"));
        System.out.println("Age of saniyat: " + myTable.getValue("saniyat"));
        System.out.println("Age of yeamin: " + myTable.getValue("yeamin"));
        System.out.println("Age of tayek: " + myTable.getValue("tayek"));
        System.out.println("Age of salma: " + myTable.getValue("salma"));

    }
}
