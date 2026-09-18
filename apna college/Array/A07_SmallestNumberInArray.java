public class A07_SmallestNumberInArray {
    public static int smallestNumber(int[] arr){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i]<smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] arr = {12, 65, 85, 67, 41, 24, 1, 52};
        System.out.println("The smallest number is:"+smallestNumber(arr));
    }
}
