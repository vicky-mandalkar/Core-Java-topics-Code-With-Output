class RanTri2{
	public static void main(String args[]){

		int n=5;
		int cnt=n*(n+1)/2;
		for(int i=n;i>=1;i--){

			int c=cnt;
			for(int j=5;j>i;j--){
				System.out.print("\t");
			}
			for(int k=i;k>=1;k--){

				System.out.print(c+"\t");
				c--;
			}
			cnt=cnt-i;
			System.out.println();

		}
	}
}
/*
15      14      13      12      11
        10      9       8       7
                6       5       4
                        3       2
                                1
*/