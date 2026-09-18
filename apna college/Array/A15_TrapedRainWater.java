public class A15_TrapedRainWater {
    public static int trapedRainWater(int[] height){
        int n = height.length;

        //Auxiliary array for left max boundary
        int[] leftmax = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(leftmax[i-1] , height[i]);
        }  

        //Auxiliary array for right max boundary 
        int[] rightmax = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }

        //Find water level 
        int trapedwater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            trapedwater += (waterLevel - height[i]);
        }

        return trapedwater;
    }
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("The volume of traped water is: " + trapedRainWater(height));
    }
}
