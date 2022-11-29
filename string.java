
public class string {
    public static boolean pal(int x) {
        int fake = x;
        int c = 0;
        while (x > 0) {
            c = c * 10 + (x % 10);
            x /= 10;
        }
        if (fake == c) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isprime(int x) {
        if(x == 2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            } 
        }
        return true;
    }
    public static void range(int x){
        for(int i = 2; i <= x; i++){
            if(isprime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static int powof2(int n){
        if(n == 0){
            return 1;
        }
        int a = powof2(n -1);
        return a * 2;
    }
    public static void BinToDec(int x){
        int p = 0;
        int b = 0;
        while(x != 0){
            //int a = x % 10;
            b += (x % 10) * powof2(p);
            p++;
            x /= 10;
        }
        System.out.println(b);
    }
    public static void DectoBin(int x){
        int b = 0;
        while(x != 0){
             b = b * 10 + x % 2;
            x /= 2;
        }
        System.out.println(b);
    }
    public static void main(String[] args) {
        // System.out.println( pal(1));
        // int x = 5;
        // DectoBin(x);
    }
}
