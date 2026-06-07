class Pyramid18{
    public static void main(String ar[]) {
        int n = 5;

        for (int i = 5; i >= 1; i--) {

            if (i == n) {
                for (int j = 1; j <= 2 * n-1; j++) {
                    System.out.print(i);
                }
            } else {

                // Left numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }

                // Spaces
                for (int s = 1; s < (n-i)*2; s++) {
                    System.out.print(" ");
                }
                

                // Right numbers
                for (int k = 1; k <= i; k++) {
                    System.out.print(i);
                }
            }

            System.out.println();
        }
    }
}

/*
555555555
4444 4444
333   333
22     22
1       1
*/