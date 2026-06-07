class DouTri10{
	public static void  main(String ar[]){
		int n=5;

		for(int i=1;i<=n;i++){
			for(int j=5;j>=i;j--){
				System.out.print(j);			
			}
			System.out.println();
		}

		for(int i=n-1;i>=1;i--){
			for(int j=5;j>=i;j--){
				System.out.print(j);			
			}
			System.out.println();
		}

	}
			
}


/*
54321
5432
543
54
5
54
543
5432
54321
*/

