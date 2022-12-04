public class maxsumarr {
    public static void maxsum(int arr[]){
        //int max = 0;
        int sum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j <= arr.length-1; j++){
                int max = 0;
                for(int k = i;k <= j; k++){
                    System.out.print(arr[k]);
                    max += arr[k];
                }
                System.out.println("=" + max);
                if(sum < max){
                    sum = max;
                }
            }
        }
        System.out.println( " max sum =" +  sum);
    }
    public static void main(String[] args) {
         int arr[] = {2, 3, 4, 5, 6, 7, 8, 9};
         maxsum(arr);

    }
}
