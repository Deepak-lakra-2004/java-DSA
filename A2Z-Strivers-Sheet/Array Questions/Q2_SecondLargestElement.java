public class Q2_SecondLargestElement {
    public static int secondLargestElement(int[] nums){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        if (nums == null || nums.length < 2) {  //if we have null array and only
            return -1;                          // one element than we return -1 
        }
        for(int i=0; i<nums.length; i++){
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            }else if(nums[i] < largest && nums[i] > secondLargest){
                secondLargest = nums[i];
            }
        }
        // edge case if second largest is never change than we return -1
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] nums = {10, 10, 10, 10, 10};
        int result = secondLargestElement(nums);
        if (result == -1) {
            System.out.println("Second largest element not exist");
        }else{
            System.out.println("The second largest element is : " + result);
        }
    }
}
