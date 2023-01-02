public class Backtraking {
    public static void trake(int arr[],int i){
        if(i == arr.length){
            return;
        }
        arr[i] = i + 1;
        trake(arr, i + 1);
        arr[i] = arr[i] - 2; 
    }
    public static void printarr(int arr[]){
        for(int i = 0; i<=arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void strsubstring(String str, String ans, int i){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.print("null");
            }else{
                System.out.print(ans);
            }
            System.out.println();
            
            return;
        }
        strsubstring(str, ans+str.charAt(i), i + 1);
        strsubstring(str, ans, i + 1);
    }
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // trake(arr,0);
        // printarr(arr);
        String str = "abc";
        strsubstring(str,"",0);

    }
}
