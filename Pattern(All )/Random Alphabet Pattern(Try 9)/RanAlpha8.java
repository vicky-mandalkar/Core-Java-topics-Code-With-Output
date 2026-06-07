class RanAlpha8{
	public static void main(String args[]){
		int n=5;
		int cnt=(n*(n-1)/2)+1;
  		for(int i=1;i<=5;i++){
			int c=cnt;
			for(int j=5;j>=i;j--){
				System.out.print((char)(64+c)+"\t");
				//System.out.print(c+"\t");
				c=(c-j)+1;
			}
			System.out.printlns();
			cnt++;

		}
	


	}


}
/*
K       G       D       B       A
L       H       E       C
M       I       F
N       J
O

11      7       4       2       1
12      8       5       3
13      9       6
14      10
15
*/