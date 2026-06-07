class TriNum8{

	public static void main(String args[]){

		int n=5;
		int cnt=(n*(n-1)/2)+1;
		
		for(int i=n;i>=1;i--){
			int c=cnt;
			for(int j=n;j>=i;j--){
				System.out.print(c+"\t");
				c=c-j;
			}
			cnt++;
			System.out.println();

		}
	}
}
/*
11
12      7
13      8       4
14      9       5       2
15      10      6       3       1
*/