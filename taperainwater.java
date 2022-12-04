
public class taperainwater {
    public static int water(int arr[]) {
        int n = arr.length;
        int lpre[] = new int[n];
        lpre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lpre[i] = Math.max(arr[i], lpre[i - 1]);
        }
        int rpre[] = new int[n];
        rpre[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            rpre[j] = Math.max(arr[j], rpre[j + 1]);
        }
        int tapewater = 0;
        for (int k = 0; k < n; k++) {
            int waterlevel = Math.min(lpre[k], rpre[k]);
            tapewater += waterlevel - arr[k];
        }
        return tapewater;

    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 0, 4, 6, 2, 0, 5 };
        System.out.println(water(arr));
    }

}