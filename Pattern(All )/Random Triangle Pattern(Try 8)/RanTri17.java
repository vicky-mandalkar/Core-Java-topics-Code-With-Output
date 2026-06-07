class RanTri17{
	public static void main(String args[]){
		int n=5;
		int cnt=1;

		for(int i=n;i>=1;i--){
			int c=cnt;  //--->1
			for(int j=1;j<i;j++){
				System.out.print("\t");
			}
			
			for(int k=5;k>=i;k--){
				System.out.print(c+"\t");
				c=c+(k-1);
			}
			System.out.println();
			cnt++;
		}
	}
}

/*
                                1
                                1
                        2       6
                3       7       10
        4       8       11      13
5       9       12      14      15
*/