import java.util.Scanner;

public class tus {
    public static int[] tar(int[] nums, int target){
        int[] num = new int[2];
        for(int i = 0; i <= nums.length - 1; i++){
            for(int j = i + 1; j <= nums.length - 1; j++){
                if(nums[i] + nums[j] == target){
                    for(int k = 0; k <= num.length; k++){
                        num[0] = i;
                        num[1] = j;

                    }
                    //System.out.println(i + "," + j);
                }
            }
        }
        return num;
        
    }
    public static void main(String[] args) {
        try (Scanner r = new Scanner(System.in)) {
            int[] nums = {7, 5, 3, 4, 7};
            System.out.print("enter a target=");
            int target = r.nextInt();
            int[] num = tar(nums, target);
            for(int i = 0; i <= num.length; i++){
                if(num[i] == 0 && num[i + 1] == 0){
                    System.out.println("sorry not found!");
                }else{
                    System.out.print(num[i] + ",");
                }
                
               
            }
        }

    }
}
