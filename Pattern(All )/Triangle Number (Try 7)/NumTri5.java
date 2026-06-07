class TriNum5{
	public static void main(String argd[]) {

		int n=5;
		int cnt=n*(n+1)/2;
		
		for(int i=n;i>=1;i--){
		
			int c=cnt;

			for(int j=n;j>=i;j--){
				System.out.print(c +"\t");
				c=c+(j-1);

			}
			c++;
			System.out.println();

		}
	

	}





}