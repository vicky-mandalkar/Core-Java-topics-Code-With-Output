class HolloTri3 {
    public static void main(String ar[]) {
        int n = 5;

        for(int i = 5; i >= 1; i--) {

            // space
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // triangle
            for(int j = 1; j <= 2*i - 1; j++) {
                if(j == 1 || j == 2*i - 1 || i == n) 
                     //System.out.print("*");
		     System.out.print(j); 
                 else 
                    System.out.print(" ");
                
            }

            System.out.println();
        }
    }
}

/*
*********
 *     *
  *   *
   * *
    *

123456789
 1     7
  1   5
   1 3
    1

*/