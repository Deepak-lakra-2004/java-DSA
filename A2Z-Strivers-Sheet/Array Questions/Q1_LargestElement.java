public class Q1_LargestElement{
    public static int largestElement(int[] nums){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            largest = Math.max(largest, nums[i]);
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] nums = {3, 3, 0, 99, -40};
        System.out.println("The largest element in array is : " + largestElement(nums));
    }
}