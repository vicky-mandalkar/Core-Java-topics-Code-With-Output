class Pyramid12{
	public static void main(String arg[]){
		int n=5;
		for(int i=1;i<=5;i++){
		
		//space
			for(int j=i;j<5;j++){
				System.out.print(" ");
			}

		//First Tri
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
	
		//Sec Tri
			for(int k=i-1;k>=1;k--){
				System.out.print(k);
			}

			System.out.println();

		}
		//================================================
        	for(int i=5;i>=1;i--){
		
		//space
			for(int j=i;j<5;j++){
				System.out.print(" ");
			}

		//First Tri
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
	
		//Sec Tri
			for(int k=i-1;k>=1;k--){
				System.out.print(k);
			}

			System.out.println();

		}    
	}

}
/*
    1
   121
  12321
 1234321
123454321
123454321
 1234321
  12321
   121
    1
*/