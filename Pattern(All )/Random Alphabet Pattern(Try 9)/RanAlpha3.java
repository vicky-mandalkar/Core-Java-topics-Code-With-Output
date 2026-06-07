class RanAlpha3{
	public static void main(String args[]){
		int n=5;
		int cnt=5;
  		for(int i=5;i>=1;i--){
			int c=cnt;
			for(int j=i;j>=1;j--){
				System.out.print((char)(64+c)+"\t");
				//System.out.print(c+"\t");
				c--;
			}
			System.out.println();
			cnt=cnt+(i-1);

		}
	


	}


}
/*
E       D       C       B       A
I       H       G       F
L       K       J
N       M
O

5       4       3       2       1
9       8       7       6
12      11      10
14      13
15


*/