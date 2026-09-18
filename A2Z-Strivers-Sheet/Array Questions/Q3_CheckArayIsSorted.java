public class Q3_CheckArayIsSorted {
    public static boolean checkArrayIsSorted(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            if (nums[i] > nums[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1};
        boolean result = checkArrayIsSorted(nums);
        if (result == true) {
            System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }
    }
}
