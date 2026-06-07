class RanTri8{
	public static void main(String args[]){
		int n=5;
		int cnt=(n*(n-1)/2)+1;

		for(int i=1;i<=5;i++){
			int c=cnt;
			for(int j=1;j<i;j++){
				System.out.print("\t");

			}
			for(int k=5;k>=i;k--){
				System.out.print(c+"\t");
				c=c-(k-1);
			}
			cnt++;
			System.out.println();
		}
	}
}
/*
11      7       4       2       1
        12      8       5       3
                13      9       6
                        14      10
                                15
*/