public class pairsinofarr {
    public static void pair(int arr[]){
        for(int i = 0; i <= arr.length; i++){
            for(int j = i + 1; j <= arr.length - 1; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        pair(arr);
    }
}
