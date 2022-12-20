public class tapwater {
    public static void traprainwater(int num[]){
        int n = num.length;
        int lmv[] = new int[n];
        lmv[0] = num[0]; 
        for(int i = 1; i < n; i++){
            lmv[i] = Math.max(lmv[i - 1], num[i]);
        }
        int rmv[] = new int[n];
        rmv[n - 1] = num[n - 1];
        for(int j = n - 2; j >= 0; j--){
            rmv[j] = Math.max(rmv[j + 1], num[j]);
        }
        int trapwater = 0;
        for(int k = 0; k < n; k++){
            int value = Math.min(lmv[k], rmv[k]);
            trapwater += value - num[k];
        }
        System.out.println(trapwater);
    }
    public static void main(String[] args) {
        int num[] = {6, 3, 4, 7, 9, 2, 5, 7};
traprainwater(num);
    }
}
