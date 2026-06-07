class DouTri13{
	public static void  main(String ar[]){
		int n=5;

		for(int i=1;i<n*2;i++){
			if(i<=5){
				for(int j=1;j<=i;j++){
					System.out.print(n-i+1);
					
				}
				System.out.println();
			}
			else{
				for(int j=i;j<n*2;j++){

					System.out.print(i-n+1);
					
				}
				System.out.println();

			}		

		}
		
		
		
	}
			
}


/*
5
44
333
2222
11111
2222
333
44
5
*/

