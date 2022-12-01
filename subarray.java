public class subarray {
    public static void sub(int arr[]) {
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        sub(arr);
    }
}
