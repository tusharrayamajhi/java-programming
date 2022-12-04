import java.util.Scanner;

public class hello {
    // public static int pow(int num,int pow){
    //     if(pow == 1){
    //         return num;
    //     }
    //    int b = pow(num, pow - 1);
    //    return b * num;
       
       
    // }
    public static int SumOfDigit(int a){
        if(a % 10 == 0){
            return 0;
        }
        return SumOfDigit(a/10) + a % 10;

    }
    // public static int fact(int a){
    //     if(a == 1){
    //         return 1;
    //     } 
    //     int b = fact(a - 1);
    //     int c = a + b ;
    //     return c;
    // }
    public static int Sum(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        try (//How to find factorial of a number using recursion ?
            //How to find the sum of digits of a number using recursion ?
            //How to calculate Power of a number using recursion ?
            //How to reverse a LinkedList using recursion ? 
            // int a = 5;
            // System.out.println(fact(a));
        //    System.out.println( SumOfDigit(545));
        //System.out.println(pow(2,3));
    Scanner r = new Scanner(System.in)) {
        int a = r.nextInt();
        int b = r.nextInt();
    System.out.println(Sum(a,b));
    }
}}