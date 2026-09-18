public class A17_FindDuplicateElement{
    public static boolean findDuplicateElement(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 2};
        System.out.println("Is there any duplicate element in array : " + findDuplicateElement(nums));
    }
}
