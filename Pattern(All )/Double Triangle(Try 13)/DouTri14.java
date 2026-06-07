class DouTri14{
	public static void  main(String ar[]){
		int n=5;

		for(int i=1;i<n*2;i++){
			if(i<=5){
				for(int j=1;j<=i;j++){
					System.out.print(i);
					
				}
				System.out.println();
			}
			else{
				for(int j=i;j<n*2;j++){

					System.out.print(n*2-i);
					
				}
				System.out.println();

			}		

		}
		
		
		
	}
			
}


/*
1
22
333
4444
55555
4444
333
22
1
*/

