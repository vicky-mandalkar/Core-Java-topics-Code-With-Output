class Pyramid20{
    public static void main(String ar[]) {
        int n = 5;

        for (int i = 1; i <= 5; i++) {

            if (i == n) {
                for (int j = 5; j >= 1; j--) 
                    if(j%2==0)
				System.out.print((char)(96+j));
			else
				System.out.print((char)(64+j));

		for (int k = 2; k <= 5; k++) 
                    if(k%2==0)
				System.out.print((char)(96+k));
			else
				System.out.print((char)(64+k));

                
            } else {

                // Left numbers
                for (int j = i; j >= 1; j--) {
                	if(j%2==0)
				System.out.print((char)(96+j));
			else
				System.out.print((char)(64+j));

			
		
                }

                // Spaces
                for (int s = 1; s < (n-i)*2; s++) {
                    System.out.print(" ");
                }
                

                // Right numbers
                for (int k = 1; k <= i; k++) {
                    if(k%2==0)
				System.out.print((char)(96+k));
			else
				System.out.print((char)(64+k));
                }
            }

            System.out.println();
        }
    }
}

/*
A       A
bA     Ab
CbA   AbC
dCbA AbCd
EdCbAbCdE

1       1
21     12
321   123
4321 1234
543212345
*/