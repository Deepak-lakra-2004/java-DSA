public class solution{
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int swap = 0;
            for(int j=0; j<n-1-i; j++){
               if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swap++;
               }else if (swap == 0) {
                break;
               }
            }
        }
    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        bubbleSort(arr);  // Sorts the array in place
        printArray(arr);  // Prints the sorted array
    }
}