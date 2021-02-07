package binarysearch;

public class BasicBinarySearch {

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

    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 12, 24, 53, 61, 71, 82, 99, 120};
//        int data = 121;
        for (int data : arr) {
            int result = binarySearch(arr, data, 0, arr.length - 1);
            if (result < 0) {
                System.out.println("Item not found");
            } else {
                System.out.println(data + " is found at position: " + result);
            }
        }
    }
}
