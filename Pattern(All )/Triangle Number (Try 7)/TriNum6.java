class TriNum6{

	public static void main(String argd[]){

		int n=5;
		int cnt=5;
		//int cnt=n*(n+1)/2;

		for(int i=n;i>=1;i--){
			int c=cnt;
			
			for(int j=n;j>=i;j--){
				System.out.print(c+"\t");
				c=c+j;

			}
			System.out.println();
			cnt--;		

		}

	}

}
/*
5
4       9
3       8       12
2       7       11      14
1       6       10      13      15
*/