package array;

import java.util.ArrayList;

public class Array01 {
    public static void main(String[] args) {
//        int expenses[] = new int[5];
        ArrayList<Integer> expenses = new ArrayList();
        
        expenses.add(2200);
        expenses.add(2350);
        expenses.add(2600);
        expenses.add(2130);
        expenses.add(2190);
        
//        1. In Feb, how many dollars you spent extra compare to January?
        System.out.println("Spent extra in February compare to January: " + (expenses.get(1) - expenses.get(0)));
        
//        Find out your total expense in first quarter (first three months) of the year.
        System.out.println("Total expense in first quarter (first three months): " + (expenses.get(0) + expenses.get(1) + expenses.get(2)));
        
//        Find out if you spent exactly 2000 dollars in any month
        System.out.println("Spent exactly 2000 dollars in any month?");
        System.out.print("Ans: ");
        int count = 0;
        for(int x : expenses) {
            if(x == 2000) {
                count++;
            }
        }
        if(count > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
//        June month just finished and your expense is 1980 dollar. Add this item to our monthly expense list
        expenses.add(1980);
        System.out.println("Expense in June: " + expenses.get(5));
        
        /*You returned an item that you bought in a month of April and got a refund of 200$.
        Make a correction to your monthly expense list based on this*/
        expenses.set(3, (expenses.get(3) - 200));
        System.out.println("Updated expense in April: " + expenses.get(3));
        
        System.out.println("Whole Array Now:");
        for(int x : expenses) {
            System.out.print(x + " ");
        }
    }
}
