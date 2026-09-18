import java.util.Scanner;

public class A02_ArrayInputOutputUpdate{
    public static void main(String[] args) {
        // Input an array
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); // math marks
        marks[1] = sc.nextInt(); // physics marks
        marks[2] = sc.nextInt(); // chemistry marks

        // Output an array
        System.out.println("Math marks:"+marks[0]+" Physics marks:"+marks[1]+" Chemistry marks:"+marks[2]);

        // Update value of an array
        marks[1] = 98;  // marks[2] = marks[1] + 2; (we can write also in this form)
        System.out.println("Updated physics marks:"+ marks[1]);
        sc.close();
    }
}