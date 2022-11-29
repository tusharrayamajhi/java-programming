import java.util.Scanner;

public class first {
    public static void sum1(int marks[]){
        int total = 0;
        for(int i = 0; i <= marks.length - 1; i++){
            total = total + marks[i];
        }
        System.out.println(total);
    }
public static void main(String[] args) {
    int marks[] = new int[100];
    marks[0] = 7;
    marks[1] = 4;
    marks[2] = 5;
    sum1(marks);

}
    
}