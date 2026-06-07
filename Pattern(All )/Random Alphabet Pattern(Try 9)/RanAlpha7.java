class RanAlpha7{
	public static void main(String args[]){
		int n=5;
		int cnt=n*(n+1)/2;
  		for(int i=1;i<=5;i++){
			int c=cnt;
			for(int j=5;j>=i;j--){
				System.out.print((char)(64+c)+"\t");
				//System.out.print(c+"\t");
				c=c-j;
			}
			System.out.println();
			cnt--;

		}
	


	}


}
/*
O       J       F       C       A
N       I       E       B
M       H       D
L       G
K

15      10      6       3       1
14      9       5       2
13      8       4
12      7
11

*/