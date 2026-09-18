public class A06_LargestNumberInArray {
    public static int largestNumber(int[] arr){
        int largest = Integer.MIN_VALUE; //acts as minus infinity so the first array number will always be bigger
        for(int i=0; i<arr.length; i++){
            if (arr[i]>largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 87, 25, 47, 11, 23, };
        System.out.println("The largest number is:" + largestNumber(arr));
    }
}
