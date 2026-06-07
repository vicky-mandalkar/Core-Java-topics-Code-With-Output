class DouTri7{
	public static void  main(String ar[]){
		int n=5;

		for(int i=n;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.print(i);			
			}
			System.out.println();
		}

		for(int i=2;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i);			
			}
			System.out.println();
		}

	}
			
}


/*

55555
4444
333
22
1
22
333
4444
55555

*/

