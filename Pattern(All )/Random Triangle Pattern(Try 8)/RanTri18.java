class RanTri18{
	public static void main(String args[]){
		int n=5;
		int cnt=n;

		for(int i=n;i>=1;i--){
			int c=cnt; 
			for(int j=1;j<i;j++){
				System.out.print("\t");
			}
			
			for(int k=5;k>=i;k--){
				System.out.print(c+"\t");
				c=c+k;
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