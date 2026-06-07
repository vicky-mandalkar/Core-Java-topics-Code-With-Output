class RanTri11{
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
				c=c-k;
			}
			cnt=cnt-(i+1);
			System.out.println();
		}
	}
}
/*
15      14      12      9       5
        13      11      8       4
                10      7       3
                        6       2
                                1
*/