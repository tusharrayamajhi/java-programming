public class first {
    public static void sum1(int marks[]){
        for(int i = 0; i <= marks.length; i++){
            System.out.println(marks[i]);
        }
    }
public static void main(String[] args) {
    int marks[] = new int[2];
    marks[0] = 7;
    marks[1] = 4;
    marks[2] = 5;
    sum1(marks);

}
    
}