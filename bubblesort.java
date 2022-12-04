public class bubblesort {
    public static void sort(int arr[]) {
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                }
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 2, 1, 8, 3, 5, 7 };
        sort(arr);
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}
