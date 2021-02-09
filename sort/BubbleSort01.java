package sort;

import java.util.Random;

class Transaction {

    String name;
    String device;
    int amount;

    Transaction(String name, String device, int amount) {
        this.name = name;
        this.amount = amount;
        this.device = device;
    }
}

public class BubbleSort01 {

    static Transaction[] bubbleSort(Transaction[] trans, String str) {
        int size = trans.length;
        Transaction temp;

        if (str.equals("amount")) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - 1 - i; j++) {
                    if (trans[j].amount > trans[j + 1].amount) {
                        temp = trans[j];
                        trans[j] = trans[j + 1];
                        trans[j + 1] = temp;
                    }
                }
            }
        }

        if (str.equals("name")) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - 1 - i; j++) {
                    if (trans[j].name.compareTo(trans[j + 1].name) > 0) {
                        temp = trans[j];
                        trans[j] = trans[j + 1];
                        trans[j + 1] = temp;
                    }
                }
            }
        }

        return trans;
    }

    public static void main(String[] args) {
        Transaction[] trans = new Transaction[4];
        Random rand = new Random();

//        for (int i = 0; i < 10; i++) {
//            trans[i] = new Transaction("name" + i, "device" + i, rand.nextInt(100));
//        }

        trans[0] = new Transaction("mona", "iphone-10", 1000);
        trans[1] = new Transaction("dhaval", "google pixel", 400);
        trans[2] = new Transaction("kathy", "vivo", 200);
        trans[3] = new Transaction("aamir", "iphone-8", 800);

        System.out.println("-----------Unsorted-----------");
        for (Transaction tran : trans) {
            System.out.print("Name: " + tran.name + ", ");
            System.out.print("Device: " + tran.device + ", ");
            System.out.print("Sale Amount: " + tran.amount);
            System.out.println("");
        }

        Transaction[] sortedTrans = bubbleSort(trans, "name");
        System.out.println("-----------Sorted-----------");
        for (Transaction tran : sortedTrans) {
            System.out.print("Name: " + tran.name + ", ");
            System.out.print("Device: " + tran.device + ", ");
            System.out.print("Sale Amount: " + tran.amount);
            System.out.println("");
        }
    }
}
