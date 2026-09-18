public class A12_MaxSubarraySumByBruteForce {
    public static int MaxSubarraySum(int[] arr){
        int currsum = 0;  // currsum == current sum 
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currsum = 0;
                for(int k=i; k<=j; k++){
                    currsum = currsum + arr[k];
                }
                System.out.println(currsum);
                if (currsum > maxSum) {
                    maxSum = currsum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int result = MaxSubarraySum(arr);
        System.out.println("The maximum subarray sum is: " + result);
    }
}
