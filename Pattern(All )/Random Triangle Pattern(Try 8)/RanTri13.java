class RanTri13{

	public static void main(String args[]){
		int n=5;
		int cnt=1;

		for(int i=1;i<=n;i++){
			int c=cnt;  //--->1
			for(int j=5;j>i;j--){
				System.out.print("\t");
			}
			
			for(int k=i;k>=1;k--){
				System.out.print(c+"\t");
				c++;
			}
			System.out.println();
			cnt=cnt+i;
		}
	}
}

/*
                                1
                        2       3
                4       5       6
        7       8       9       10
11      12      13      14      15
*/