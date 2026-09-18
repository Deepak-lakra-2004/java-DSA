public class A04_PassingArrayAsArgument{
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] += 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {90, 92, 95};
        System.out.println("Marks before update:"+marks[0]);
        update(marks);
        System.out.println("Marks after update:"+marks[0]);
    }
}