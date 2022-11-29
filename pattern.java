public class pattern {
    public static void HolloPattern() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i == 5 || i == 0 || j == 0 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

public static void pattern(){


    int i, j, row = 6;
    for(i=0;i<row;i++){  
        for (j=row-i; j>1; j--)   {  
            System.out.print(" ");   
        }   
        for (j=0; j<=i; j++ )   {   
            System.out.print("* ");   
        }   
            System.out.println();
    }
}

    public static void main(String[] args) {
        // HolloPattern();
        pattern();
    }
}
