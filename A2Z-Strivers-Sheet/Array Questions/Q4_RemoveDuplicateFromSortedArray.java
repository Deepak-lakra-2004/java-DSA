public class Q4_RemoveDuplicateFromSortedArray {
    public static int removeDuplicateFromSortedArray(int[] nums){
        int count = 1; 
        for(int i=0; i<nums.length-1; i++){
            if (nums[i] == nums[i+1]) {
                continue;
            }else if(nums[i] != nums[i+1]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {0, 0, 3, 3, 5, 6, 6, 8, 8, 9, 10, 12, 12, 12, 12};
        System.out.println("Total number of unique element in nums array is : " + removeDuplicateFromSortedArray(nums));
    }
}
