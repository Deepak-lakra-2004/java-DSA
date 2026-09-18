public class A18_RoatedSortedArray {
    public static int roatedSortedArray(int[] arr, int target, int k){
        int start = k+2;
        int end = k+1;
        while(start <= end){
            int mid = (start+end) / 2;
            if (arr[mid] == target) {
                return mid;
            }else if(arr[mid] > target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {6, 8, 9, 11, 1, 2, 3};
        int target = 6;
        int k = 2;
        System.out.println("The target at index :" + roatedSortedArray(arr, target, k));
    }
}

// this question is on hold until i dont study hashset