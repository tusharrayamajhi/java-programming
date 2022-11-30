import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.PopupMenuBorder;

public class first {
    public static void sum1(int marks[]) {
        int total = 0;
        for (int i = 0; i <= marks.length - 1; i++) {
            total = total + marks[i];
        }
        System.out.println(total);
    }

    public static void LinearSearch(int num[], int number) {
        for (int i = 0; i <= num.length - 1; i++) {
            if (num[i] == number) {
                System.out.println("found at:- " + i);
            }
        }
    }

    public static void Largestamongarray(int num[]) {
        int inf = Integer.MIN_VALUE;
        for (int i = 0; i <= num.length - 1; i++) {

            if (num[i] > inf) {
                inf = num[i];
            }
        }
        System.out.println(inf);
    }

    public static void main(String[] args) {
        int marks[] = { 3, 4, 5, 9, 11, 2, 1 };
        // sum1(marks);
        // LinearSearch(marks, 4);
        
        Largestamongarray(marks);

    }

}