public class add {
    public static int[] add(int[] l1, int[] l2){
        int a = l1.length;
        int[] c = new int[2];
        int d = 0;
        for(int i = 0; i <= a; i++){
                if(l1[i] + l2[i] == 10){
                    c[i] = 0;
                    d = 1;
                }else if(l1[i] + l2[i] > 10){
                    c[i] = (l1[i] + l2[i]) - 10;
                    d = 1;
                    
                }else{
                    c[i] = l1[i] + l2[i] + d;
                }
                
        }
        return c;
    }
    public static void main(String[] args) {
        int[] l1 =  {2,4,3};
        int[] l2 = {5,6,4};
        System.out.println(l1.length);
        
        int[] num = add(l1, l2);
        for(int i = 0; i <= num.length; i++){
            System.out.println(num[i]);
        }
 
    }
}
