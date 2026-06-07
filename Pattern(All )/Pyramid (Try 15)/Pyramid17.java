class Pyramid17{
    public static void main(String ar[]) {
        int n = 5;

        for (int i = 1; i <= 5; i++) {

            if (i == n) {
                for (int j = 1; j <= n; j++) 
                    System.out.print(j);

		for (int j = n-1; j >= 1; j--) 
                    System.out.print(j);

                
            } else {

                // Left numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }

                // Spaces
                for (int s = 1; s < (n-i)*2; s++) {
                    System.out.print(" ");
                }
                

                // Right numbers
                for (int k = i; k >= 1; k--) {
                    System.out.print(k);
                }
            }

            System.out.println();
        }
    }
}

/*
1       1
12     21
123   321
1234 4321
123454321
*/