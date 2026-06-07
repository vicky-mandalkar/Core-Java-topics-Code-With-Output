class RevTri11{

	public static void main(String args[]){
	
		for(int i=1;i<=5;i++){

			for(int j=5;j>=i;j--){
		
				System.out.print( (char)(64+j) );	
			}
			System.out.println();


		}

	}
}

/*
EDCBA
EDCB
EDC
ED
E
*/