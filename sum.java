
public class sum {
    public static int powof2(int n){
        if(n == 0){
            return 1;
        }
        int a = powof2(n - 1);
        return a * 2;
    }
    // public static boolean ispowoftwo(int n){
    //     for(int i = 0; i <= n; i++ ){
    //         if(n == powof2(i)){
    //             return true;
    //    }
    //     }
    //     return false;
        
    // }

    public static int fib(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        int a = fib(n - 1);
        int b = fib(n - 2);
        return (a + b);
    }
    public static void main(String[] args) {
      
    //    System.out.println( ispowoftwo(32767));
    //    System.out.println( ispowoftwo(3));
    }
}
