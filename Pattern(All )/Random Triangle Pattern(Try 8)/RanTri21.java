class RanTri21{
	public static void main(String args[]){
		int n=5;
		int cnt=(n*(n-1)/2)+1;

		for(int i=n;i>=1;i--){
			int c=cnt; 
			for(int j=1;j<i;j++){
				System.out.print("\t");
			}
			
			for(int k=i;k<=5;k++){
				System.out.print(c+"\t");
				c=c+(k+1);
			}
			System.out.println();
			cnt=cnt-(i-1);
		}
	}
}

/*
                                11
                        7       12
                4       8       13
        2       5       9       14
1       3       6       10      15
*/