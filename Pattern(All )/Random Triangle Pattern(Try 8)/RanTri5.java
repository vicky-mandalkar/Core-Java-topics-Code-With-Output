class RanTri5{

	public static void  main(String ar[]){
		int n=5;
		int cnt=1;
		for(int i=1;i<=5;i++){
			int c=cnt;
			
			for(int j=1;j<i;j++){
				System.out.print("\t");
			}

			for(int k=5;k>=i;k--){
				System.out.print(c+"\t");
				c=c+k;
			}
			
			cnt++;
			System.out.println();


		

		}


	}

}
/*
1       6       10      13      15
        2       7       11      14
                3       8       12
                        4       9
                                5
*/
