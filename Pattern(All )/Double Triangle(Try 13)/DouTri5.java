class DouTri5{
	public static void  main(String ar[]){
		int n=5;

		for(int i=n;i>=1;i--){
			for(int j=5;j>=i;j--){
				System.out.print(j);			
			}
			System.out.println();
		}

		for(int i=n-1;i>=1;i--){
			for(int j=5;j>=n-i+1;j--){
				System.out.print(j);			
			}
			System.out.println();


		}
	}
			
}


/*

5
54
543
5432
54321
5432
543
54
5

*/

