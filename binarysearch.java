public class binarysearch {
    public static int Binarysearch(int marks[], int key){
        int start_val = 0;
        int last_val = marks.length - 1;
        while(start_val <= last_val){
        int mid_val = (start_val + last_val) / 2;
        if(marks[mid_val] < key){
            start_val = mid_val + 1;
        }else if(marks[mid_val] == key){
            return mid_val;
        }else{
            last_val = mid_val - 1;
        }
    }
    return -1;
     }
    public static void main(String[] args) {
         int marks[] = {1, 3, 5};
         System.out.println(Binarysearch(marks, 2));

    }
}
