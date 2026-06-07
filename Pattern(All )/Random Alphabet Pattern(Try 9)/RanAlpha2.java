class RanAlpha2{
	public static void main(String args[]){
		int n=5;
		int cnt=n*(n+1)/2;
  		for(int i=5;i>=1;i--){
			int c=cnt;
			for(int j=i;j>=1;j--){
				System.out.print((char)(64+c)+"\t");
				//System.out.print(c+"\t");
				c--;
			}
			System.out.println();
			cnt=cnt-i;

		}
	


	}


}
/*
O       N       M       L       K
J       I       H       G
F       E       D
C       B
A

15      14      13      12      11
10      9       8       7
6       5       4
3       2
1
*/