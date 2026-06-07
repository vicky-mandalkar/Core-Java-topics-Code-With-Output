class RanAlpha5{
	public static void main(String args[]){
		int n=5;
		int cnt=1;
  		for(int i=1;i<=n;i++){
			int c=cnt;
			for(int j=5;j>=i;j--){
				System.out.print((char)(64+c)+"\t");
				//System.out.print(c+"\t");
				c=c+j;
			}
			System.out.println();
			cnt++;

		}
	


	}


}
/*
A       F       J       M       O
B       G       K       N
C       H       L
D       I
E

1       6       10      13      15
2       7       11      14
3       8       12
4       9
5
*/