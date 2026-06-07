class TriNum7{

	public static void main(String args[]){

		int n=5;
		int cnt=n*(n+1)/2;

		for(int i=5;i>=1;i--){
			int c=cnt;
			for(int j=n;j>=i;j--){
				
				System.out.print(c+"\t");
				c=c-j+1;

			}
			cnt--;
			System.out.println();
		}
	}
}
/*
15
14      10
13      9       6
12      8       5       3
11      7       4       2       1
*/