class RanTri22{
	public static void main(String args[]){
		int n=5;
		int cnt=n*(n+1)/2;

		for(int i=n;i>=1;i--){
			int c=cnt; 
			for(int j=1;j<i;j++){
				System.out.print("\t");
			}
			
			for(int k=i;k<=5;k++){
				System.out.print(c+"\t");
				c=c+k;
			}
			System.out.println();
			cnt=cnt-i;
		}
	}
}

/*
                                15
                        10      14
                6       9       13
        3       5       8       12
1       2       4       7       11
*/