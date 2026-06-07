class RanAlpha1{
	public static void main(String args[]){
		int n=5;
		int cnt=1;
  		for(int i=5;i>=1;i--){
			int c=cnt;
			for(int j=i;j>=1;j--){
				//System.out.print((char)(64+c)+"\t");
				System.out.print(c+"\t");
				c++;
			}
			System.out.println();
			cnt=cnt+i;

		}
	


	}


}
/*
A       B       C       D       E
F       G       H       I
J       K       L
M       N
O

1       2       3       4       5
6       7       8       9
10      11      12
13      14
15

*/