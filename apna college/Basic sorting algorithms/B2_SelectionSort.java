public class B2_SelectionSort {
    
    // Time Complexity: O(N^2) for Best, Average, and Worst cases
    // Space Complexity: O(1)
    public static void selectionSort(int[] arr) {
        // Edge case protection
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Assume the current position 'i' holds the smallest value
            int minPos = i;
            
            // Search the rest of the array to find the true smallest value
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j; // Update the position of the smallest element
                }
            }
            
            // Swap the smallest found element with the element at position 'i'
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Moves to the next line
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 0};
        selectionSort(arr);
        printArray(arr);
    }
}