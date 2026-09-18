public class A08_BinarySearch {
    public static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = (start+end)/2;

            // comparison
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) { //WE search in left half
                end = mid-1;
            }else{  // We search in right half
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 6, 9, 12, 18, 25, 37, 64, 79, 86};
        int key = 18;
        int index = binarySearch(arr, key);
        System.out.println("The key at index: "+index);
    }
}
