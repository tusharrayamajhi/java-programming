import java.util.Scanner;

public class substring {
    public static void substr(String str,int start_index, int end_index){
        for(int i = start_index; i <= end_index; i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any words");
        String s = sc.nextLine();
        System.out.println("enter a starting and ending index which you want to print. It most not be greater then " + (s.length() - 1));
        int start_index = sc.nextInt();
        int end_index = sc.nextInt();
        //String str = "Hello World";
        if(start_index >= 0 && end_index <= s.length() - 1){
            substr(s,start_index,end_index);
        }
        

    }
}
