public class example {
    public static int twoSum(int[] arr, int target){
        for(int i=arr.length-1; i>=1; i--){
            if(arr[0] + arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 3;
        System.out.println(twoSum(arr, target));
    }
}
