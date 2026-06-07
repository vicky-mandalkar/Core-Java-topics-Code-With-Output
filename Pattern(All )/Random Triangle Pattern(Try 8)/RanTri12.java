class RanTri12{
	public static void main(String args[]){
		int n=5;
		int cnt=n*(n+1)/2;

		for(int i=1;i<=5;i++){
			int c=cnt;
			for(int j=1;j<i;j++){
				System.out.print("\t");

			}
			for(int k=i;k<=5;k++){
				System.out.print(c+"\t");
				c=c-(k+1);
			}
			cnt=cnt-i;
			System.out.println();
		}
	}
}
/*
15      13      10      6       1
        14      11      7       2
                12      8       3
                        9       4
                                5
*/