package sort;

public class BubbleSort {
    
    static int[] bubbleSort(int[] arr) {
        int size = arr.length;
        int temp;
        
        for (int i = 0; i < size - 1; i++) {
//            boolean swapped = false;
            for (int j = 0; j < size - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
//                    swapped = true;
                }
//                if(!swapped) {
//                    break;
//                }
            }
        }
        
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 2, 1, 67, 34, 88, 35};
//        int[] arr = {1,2,3,4,5,8,6};
        int[] result = bubbleSort(arr);
        for(int x : arr) {
            System.out.print(x + ", ");
        }
    }
}
