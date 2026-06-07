class Pyramid19{
    public static void main(String ar[]) {
        int n = 5;

        for (int i = 5; i >= 1; i--) {

            if (i == 1) {
                for (int j = 5; j >= 1; j--) 
                    System.out.print(j);

		for (int j =i+1; j <= 5; j++) 
                    System.out.print(j);

                
            } else {

                // Left numbers
                for (int j = n; j >= i; j--) {
                    System.out.print(j);
                }

                // Spaces
                for (int s = 1; s <=(2*i)-3 ; s++) {
                    System.out.print(" ");
                }
                

                // Right numbers
                for (int k = i; k <= n; k++) {
                    System.out.print(k);
                }
            }

            System.out.println();
        }
    }
}

/*
5       5
54     45
543   345
5432 2345
543212345
*/