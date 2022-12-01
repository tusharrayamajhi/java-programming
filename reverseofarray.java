public class reverseofarray {
    public static void reverseofarr(int num[]){
        int start = 0;
        int last = num.length - 1;
        while(start <= last){
            int temp = num[start];
            num[start] = num[last];
            num[last] = temp;
            start++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseofarr(num);
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
}