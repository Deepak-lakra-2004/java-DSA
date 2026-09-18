public class A10_PairsInArray {
    public static void pairsOfArray(int[] arr){
        int tp = 0; //tp = total pairs
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total noumber of pairs: "+tp);
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 9};
        pairsOfArray(arr);
    }
}
