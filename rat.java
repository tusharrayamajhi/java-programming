import java.util.ArrayList;
public class rat {
    public static boolean IsSafe(int arr[][],int i ,int j, int n, int m){
        if(arr[i][j] == 0){
            return false;
        }
        return true;
    }
    public static void Waysforat(int arr[][],int i,int j,String str){
        if(arr[i][j] == n  ){
            return;
        }
        int sub[][] = new int[arr.length][arr.length];
        Waysforat(arr, i+1, j,str);
        Waysforat(arr, i, j - 1, str);
    }
    public static void main(String[] args) {
        int arr[][] = { 
            { 1, 0, 0, 0 },
            { 1, 1, 0, 1 },
            { 0, 1, 0, 0 },
            { 1, 1, 1, 1 }};
        Waysforat(arr, 0, 0,"");
    }
}
