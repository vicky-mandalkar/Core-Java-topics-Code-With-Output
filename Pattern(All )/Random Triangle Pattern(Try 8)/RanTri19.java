class RanTri19{
	public static void main(String args[]){
		int n=5;
		int cnt=(n*(n-1)/2)+1;

		for(int i=n;i>=1;i--){
			int c=cnt; 
			for(int j=1;j<i;j++){
				System.out.print("\t");
			}
			
			for(int k=5;k>=i;k--){
				System.out.print(c+"\t");
				c=c-k;
			}
			System.out.println();
			cnt++;
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