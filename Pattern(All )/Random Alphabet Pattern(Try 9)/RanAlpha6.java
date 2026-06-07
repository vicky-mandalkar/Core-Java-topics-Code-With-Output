class RanAlpha6{
	public static void main(String args[]){
		int n=5;
		int cnt=n;
  		for(int i=1;i<=n;i++){
			int c=cnt;
			for(int j=5;j>=i;j--){
				System.out.print((char)(64+c)+"\t");
				//System.out.print(c+"\t");
				c=c+j-1;
			}
			System.out.println();
			cnt--;

		}
	


	}


}
/*
E       I       L       N       O
D       H       K       M
C       G       J
B       F
A

5       9       12      14      15
4       8       11      13
3       7       10
2       6
1
*/