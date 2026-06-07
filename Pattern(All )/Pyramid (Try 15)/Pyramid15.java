class Pyramid15{
    public static void main(String ar[]) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            if (i == n) {
                for (int j = 1; j <= 2 * n-1; j++) {
                    System.out.print("*");
                }
            } else {

                // Left numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                // Spaces
                for (int s = 1; s < (n-i)*2; s++) {
                    System.out.print(" ");
                }
                

                // Right numbers
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
/*
*       *
**     **
***   ***
**** ****
*********
*/