class RanTri16{
	public static void main(String args[]){
		int n=5;
		int cnt=n*(n+1)/2;

		for(int i=1;i<=n;i++){
			int c=cnt;  //--->15
			for(int j=5;j>i;j--){
				System.out.print("\t");
			}
			
			for(int k=1;k<=i;k++){
				System.out.print(c+"\t");
				c++;
			}
			System.out.println();
			cnt=cnt-(i+1);
		}
	}
}

/*
                                15
                        13      14
                10      11      12
        6       7       8       9
1       2       3       4       5

*/