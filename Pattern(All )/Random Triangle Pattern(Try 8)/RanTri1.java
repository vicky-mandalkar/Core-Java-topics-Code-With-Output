
class RanTri1{

	public static void  main(String ar[]){
		int n=5;
		int cnt=1;
		for(int i=n;i>=1;i--){
			int c=cnt;
			
			for(int j=n;j>i;j--){
				System.out.print("\t");
			}

			for(int k=i;k>=1;k--){
				System.out.print(c+"\t");
				c++;
			}
			
			cnt=cnt+i;
			System.out.println();


		

		}


	}

}
/*
1       2       3       4       5
        6       7       8       9
                10      11      12
                        13      14
                                15
*/
