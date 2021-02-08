package binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch02 {
    static int binarySearch(int[] arr, int data, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (arr[mid] == data) {
                return mid;
            }

            if (data < arr[mid]) {
                return binarySearch(arr, data, left, mid - 1);
            }

            return binarySearch(arr, data, mid + 1, right);
        }
        return -1;
    }
    
    static ArrayList<Integer> findAllOccurances(int[] arr, int data) {
        int mid = binarySearch(arr, data, 0, arr.length - 1);
        ArrayList<Integer> result = new ArrayList();
        result.add(mid);
        
        int i = mid - 1;
        while(i >= 0) {
            if(arr[i] == data) {
                result.add(i);
                i--;
            } else {
                break;
            }
        }
        
        i = mid + 1;
        while(i < arr.length) {
            if(arr[i] == data) {
                result.add(i);
                i++;
            } else {
                break;
            }
        }
        
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,6,9,11,15,15,15,17,21,34,34,56};
        int data = 15;
        System.out.println(findAllOccurances(arr, data));;
    }
}
