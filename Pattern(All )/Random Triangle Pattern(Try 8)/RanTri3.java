class RanTri3{
	public static void  main(String args[]){

		int n=5;
		int cnt=n;
		
		for(int i=n;i>=1;i--){
			int c=cnt;

		 	for(int j=n;j>i;j--){
				System.out.print("\t");
			}
 			
			for(int k=i;k>=1;k--){
				System.out.print(c+"\t");
				c--;

			}
			cnt=cnt+(i-1);
			System.out.println();
		}
	}
}
/*
5       4       3       2       1
        9       8       7       6
                12      11      10
                        14      13
                                15
*/