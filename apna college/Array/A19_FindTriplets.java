public class A19_FindTriplets {
    public static void returnTriplets(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if (arr[i]+arr[j]+arr[k] == 0) {
                       System.out.println("[" + i + "," + j + "," + k + "]"); 
                    }else{
                        System.out.println("[]");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        returnTriplets(arr);
    }
}
