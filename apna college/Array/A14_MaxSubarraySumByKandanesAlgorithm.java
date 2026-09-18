public class A14_MaxSubarraySumByKandanesAlgorithm{
    public static int kadanesOneLoop(int[] arr) {
    int cs = 0;
    int ms = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
        cs = cs + arr[i];
        
        // 1. Update the max sum FIRST
        ms = Math.max(ms, cs);
        
        // 2. THEN reset cs to 0 if it goes negative
        if (cs < 0) {
            cs = 0;
        }
    }
    return ms;
}
    public static void main(String[] args) {
        int[] arr = {-2, -3, -4, -1, -2, -1, -5, -3};
        System.out.println("The max subarray is :" + kadanesOneLoop(arr));
    }
}