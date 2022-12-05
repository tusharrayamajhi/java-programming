
public class spiralmatrix {
    public static void spiral(int number[][]){
        int start_row = 0;
        int start_column = 0;
        int end_row = number.length - 1;
        int end_column = number[0].length - 1;
        while(start_row <= end_row && start_column <= end_column){
            for(int i = start_column; i <= end_column; i++){
                System.out.print(number[start_row][i] + " ");
            }
            for(int j = start_row + 1; j <= end_row; j++ ){
                System.out.print(number[j][end_column] + " ");
            }
            for(int k = end_column - 1; k >= start_column;k--){
                System.out.print(number[end_row][k] + " ");
            }
            for(int l = end_row - 1; l >= start_row + 1;l--){
                System.out.print(number[l][start_column] + " ");
            }
            start_row++;
            start_column++;
            end_row--;
            end_column--;
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int number[][] = {{1, 2, 3, 4, 17,},
                          {5, 6, 7, 8, 18,},
                          {9, 10, 11, 12, 19,},
                          {13, 14, 15, 16, 20,},
                           {21, 22, 23, 24, 25,}};
                          spiral(number);

    }
}
