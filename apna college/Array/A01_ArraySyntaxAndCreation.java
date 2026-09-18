public class A01_ArraySyntaxAndCreation{
    public static void main(String[] args) {
        //creating an array (option:1)

        int marks[] = new int[20];  // Creates an int array of size 20; all values are initially 0.

        //  Creating and initializing an array (option:2)
        int mark[] = {10, 20, 30, 40}; // Creates and initializes an array with values.

        // Accessing array elements using index
        System.out.println(marks[0]); // output: 0 (default value for int)
        System.out.println(mark[2]);  // output: 30 (index 2 stores 30)
    }
}