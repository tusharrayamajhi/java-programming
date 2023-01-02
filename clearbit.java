import javax.net.ssl.HostnameVerifier;

public class clearbit {
    public static void accu(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.println(i + " ");
        }
        accu(arr, key, i + 1);
    }
    public static int re(int a) {
        if (a == 0) {
            return 0;
        }
        int b = re(a - 1);
        return b + a;
    }
    public static void word(int a){
        String words[] = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if(a == 0){
            return;
        }
        int num = a % 10;
        word(a / 10);
        System.out.println(words[num] + " ");
    }
    public static void lengthofstring(String str,int i){
        int count = 0;
       if(i != str.length()){
        count += 1;
       }
       lengthofstring(str, i + 1);
       System.out.println(count);
    }
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int b = fib(n - 1);
        int c = fib(n - 2);
        int d = c + b;
        System.out.println(d + " ");
        return d;
    }
    public static boolean sort(int arr[],int i){
        if(i == arr.length - 1){
            return true;
        }
        
        if(arr[i] > arr[i + 1]){
            return false;
        }
        return sort(arr, i + 1);
        
    } 
    public static int occ(int num[],int i,int key){
        
        if(i == num.length - 1){
            return -1;
        }
        if(num[i] == key){
            return i;
        }
        
        return occ(num, i + 1, key);
    }
    public static int numofpair(int n){
        if(n == 1|| n == 2){
            return n;
        }
        int a = numofpair(n - 1);
        int b =  (n - 1) * numofpair(n - 2);
        int total = a + b;
        return total;
    }
    public static int search(int arr[],int target){
        int low = 0;
        int high = arr.length -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[low] < arr[mid]){
                if(target >= arr[low] && target < arr[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(target > arr[mid] && target <= arr[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int a = 5;
        // System.out.println(re(a));
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 }, key = 2;
        // accu(arr, key, 0);
        // word(126034);
        // String str = "tushar";
        // System.out.println(str.length());
        // lengthofstring(str, 1);
        // System.out.println(fib(10));
        //int arr[] = {1, 2, 7, 4, 5, 6, 7};
        //System.out.println(sort(arr,0));
        //System.out.println(occ(arr, 0, 11));
        //System.out.println(numofpair(4));
        int arr[] = {5, 6, 7, 1, 2, 3, 4};
        System.out.println(search(arr, 5));
        System.out.println(search(arr, 4));
        System.out.println(search(arr, 1));
        System.out.println(search(arr, 9));
    }

}
// class Sumoftwonumber{
// int a;
// Sumoftwonumber(){
// a = 5;
// System.out.println("hello");
// }
// void sum(){
// int a = 6;
// System.out.println(a + " ");
// // Scanner sc = new Scanner(System.in);
// // int a = sc.nextInt();
// // int b = sc.nextInt();
// // System.out.println(a + b);
// }
// }