public class bitmanupalition {
    public static void main(String[] args) {
    //     int i = 3;
    //     int n = 10;
    //  int bitmask = 1 << i;
    //  System.out.println(bitmask);
    //  if((n & bitmask) == 0){
    //     System.out.println("0");
    //  }else{
    //     System.out.println("1");
    //  }
     int i = 2;
     int n = 15;
     int a = (~0) << i;
     System.out.println(a);
     System.out.println((n & (~0)<<i));

    }
    
    public static void evenOrOdd(int number) {
      if ((number & 1) == 0) {
        System.out.println(number + " is even.");
      } else {
        System.out.println(number + " is odd.");
      }
    }
}

  