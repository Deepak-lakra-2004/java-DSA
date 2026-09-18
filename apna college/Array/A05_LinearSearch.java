public class A05_LinearSearch{
    public static int linearSearch(int[] numbers , int key){
        for(int i=0; i<numbers.length; i++){
            if (numbers[i]==key) {
                return i;
            }
        }
        return -1;  // it means key is not found 
    }
    public static void main(String[] args) {
        int[] numbers = {1, 15, 51, 56, 78, 89, 65, 36};
        int key = 78;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not found");
        }else{
            System.out.println("Our key at index:"+ index);
        }
    }
}