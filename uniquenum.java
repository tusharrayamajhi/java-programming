public class uniquenum {
    public static boolean num1(int num[]){
        for(int i = 0; i <= num.length - 1;i++){
            for(int j = i + 1; j <= num.length - 1; j++){
                 if(num[i] == num[j]){
                return true;
            }
            }
           
        }
        return false;
    }
    public static void main(String[] args) {
        int num[] = {1, 8, 8, 5, 6, 7};
        
        System.out.println(num1(num));

    }
}
