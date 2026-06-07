class Pyramid8{
	public static void main(String args[]){
		int n=5;
		for(int i=5;i>=1;i--){

		//Space
			for(int j=i;j<5;j++){
				System.out.print(" ");

			}

		//first Tri
			for(int j=1;j<=i;j++){
				if(j%2!=0){
					System.out.print((char)(64+j));
					//System.out.print(j);
				}
				else{
					System.out.print((char)(96+j));
					//System.out.print(j);
				}
			}

		//Second tri 
			for(int j=i-1;j>=1;j--){
				if(j%2!=0){
					System.out.print((char)(64+j));
					//System.out.print(j);
				}
				else{
					System.out.print((char)(96+j));
					//System.out.print(j);
				}			
			} 
			
			System.out.println();
		}
	}

}
/*
AbCdEdCbA
 AbCdCbA
  AbCbA
   AbA
    A

123454321
 1234321
  12321
   121
    1

*/