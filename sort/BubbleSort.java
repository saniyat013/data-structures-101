package sort;

public class BubbleSort {
    
    static int[] bubbleSort(int[] arr) {
        int size = arr.length;
        int temp;
        
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 2, 1, 67, 34, 88, 35};
        int[] result = bubbleSort(arr);
        for(int x : arr) {
            System.out.print(x + ", ");
        }
    }
}
