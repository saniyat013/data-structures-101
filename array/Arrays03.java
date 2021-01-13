package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int maxNumber = scan.nextInt();
        
        ArrayList<Integer> oddNum = new ArrayList();
        
        for (int i = 1; i <= maxNumber; i+=2) {
            oddNum.add(i);
        }
        
        System.out.println(oddNum);
    }
}
