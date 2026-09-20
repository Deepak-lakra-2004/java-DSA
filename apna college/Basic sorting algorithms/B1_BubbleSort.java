    // Time Complexity: O(N^2) Worst/Average, O(N) Best
    // Space Complexity: O(1)

public class B1_BubbleSort{
    public static void bubbleSort(int[] arr){

        // Edge case: Return immediately if array is empty or has only 1 element
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int swap = 0;
            for(int j=0; j<n-1-i; j++){
               if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swap++;
               }
            }
            // Optimization: If no swaps occurred, the array is already sorted
            if (swap == 0) {
                break;
            }
        }
    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 0};
        bubbleSort(arr);  // Sorts the array in place
        printArray(arr);  // Prints the sorted array
    }
}