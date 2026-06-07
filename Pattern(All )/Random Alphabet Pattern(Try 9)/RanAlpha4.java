class RanAlpha4{
	public static void main(String args[]){
		int n=5;
		int cnt=(n*(n-1)/2)+1;
  		for(int i=5;i>=1;i--){
			int c=cnt;
			for(int j=i;j>=1;j--){
				System.out.print((char)(64+c)+"\t");
				//System.out.print(c+"\t");
				c++;
			}
			System.out.println();
			cnt=cnt-i+1;

		}
	


	}


}
/*
K       L       M       N       O
G       H       I       J
D       E       F
B       C
A

11      12      13      14      15
7       8       9       10
4       5       6
2       3
1
*/