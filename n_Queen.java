public class n_Queen {
    public static boolean isSafe(char arr[][] ,int row,int col){
        //vertical
        for(int i = row-1;i>=0;i--){
            if(arr[i][col] == 'Q'){
                return false;
            }
        }
        //leftdig
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0;i--,j--){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        //rightdig
        for(int i = row - 1, j = col + 1; i >= 0 && j < arr.length;i--,j++){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueen(char arr[][],int row){
        if(row == arr.length){
            printarr(arr);
            return;
        }
        for(int j = 0;j<arr.length;j++){
            if(isSafe(arr,row,j)){
                arr[row][j] = 'Q';
            nQueen(arr, row + 1);
            arr[row][j] = 'x';
            }
            

        }
    }
    public static void printarr(char arr[][]){
        System.out.println("--------chess-------");
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char arr[][] = new char[n][n];
        for(int i = 0;i<arr.length; i++){
            for(int j = 0;j<arr.length; j++){
                arr[i][j] = 'X';
            }
        }
        nQueen(arr,0);
    }
}
