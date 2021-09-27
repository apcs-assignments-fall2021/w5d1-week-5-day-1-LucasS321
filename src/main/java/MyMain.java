import java.util.Arrays;

public class MyMain {
    // Sorting:
    // Implement the selection sort algorithm that we discussed in class
    // to sort our code
    // This algorithm returns the sorted array
    public static int[] selectionSort(int[] arr) {
        int pre = -9999;
        int smallest = 0;
        for (int i = 0; i< arr.length;i++) {
            smallest = 99999;
            int sm2 = -1;
            for (int x = i; x < arr.length; x++) {
                if (arr[x] < smallest) {
                    if (arr[x] > pre) {
                        smallest = arr[x];
                        sm2 = x;
                    }
                }
            }
            int prearr = arr[i];
            arr[i] = smallest;
            arr[sm2] = prearr;
            pre = smallest;
        }
        // REPLACE THIS WITH YOUR CODE
        return arr;
    }

    // Implement the insertion sort algorithm that we discussed in class
    // to sort our code
    // This algorithm returns the sorted array
    public static int[] insertionSort(int[] arr) {
        for (int sero = 0; sero < arr.length; sero++) {

        }
        // REPLACE THIS WITH YOUR CODE
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Selection Sort Tests");
        System.out.println(Arrays.toString(selectionSort(new int[] {6, 1, 3, 8, 2, 9}))); // [1, 2, 3, 6, 8, 9]
        System.out.println(Arrays.toString(selectionSort(new int[] {12, 5, 23, 74, 15, 86, 2}))); // [2, 5, 12, 15, 23, 74, 86]

        System.out.println("Selection Sort Tests");
        System.out.println(Arrays.toString(selectionSort(new int[] {6, 1, 3, 8, 2, 9}))); // [1, 2, 3, 6, 8, 9]
        System.out.println(Arrays.toString(selectionSort(new int[] {12, 5, 23, 74, 15, 86, 2}))); // [2, 5, 12, 15, 23, 74, 86]
    }
}