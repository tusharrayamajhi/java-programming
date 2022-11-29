import java.util.Scanner;

public class first {
    public static void sum1(int a, int b){
        System.out.println(a + b);
    }
public static void main(String[] args) {
    Scanner r = new Scanner(System.in);
    int a = r.nextInt();
    int b = r.nextInt();
    sum1(b, a);
}
    
}