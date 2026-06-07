class RanTri7{
	public static void main(String args[]){
		int n=5;
		int cnt=n*(n+1)/2;

		for(int i=1;i<=5;i++){
			int c=cnt;
			for(int j=1;j<i;j++){
				System.out.print("\t");

			}
			for(int k=5;k>=i;k--){
				System.out.print(c+"\t");
				c=c-k;
			}
			cnt--;
			System.out.println();
		}
	}
}
/*
15      10      6       3       1
        14      9       5       2
                13      8       4
                        12      7
                                11
*/