class Pyramid13 {
    public static void main(String ar[]) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            if (i == n) {
                for (int j = 1; j <= 2 * n-1; j++) {
                    System.out.print(j);
                }
            } else {

                // Left numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                // Spaces
                for (int s = i; s < n; s++) {
                    System.out.print(" ");
                }
                for (int s = i; s < n-1; s++) {
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
123456789
*/