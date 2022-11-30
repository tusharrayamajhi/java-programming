public class binarysearch {
    public static int Binarysearch(int marks[], int key){
        int start_val = 0;
        int last_val = marks.length - 1;
        while(start_val <= last_val){
        int mid_val = (start_val + last_val) / 2;
        if(marks[mid_val] < key){
            start_val = mid_val + 1;
        }else if(marks[mid_val] == key){
            return 1;
        }else{
            last_val = mid_val - 1;
        }
    }
    return -1;
     }
    public static void main(String[] args) {
         int marks[] = {2, 3, 5, 7, 12, 14, 35, 40, 43, 48, 53, 57, 61};
         System.out.println(Binarysearch(marks, 0));

    }
}
