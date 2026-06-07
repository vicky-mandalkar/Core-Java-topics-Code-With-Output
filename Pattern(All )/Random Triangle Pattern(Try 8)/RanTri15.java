class RanTri15{
	public static void main(String args[]){
		int n=5;
		int cnt=1;

		for(int i=1;i<=n;i++){
			int c=cnt;  //--->1
			for(int j=5;j>i;j--){
				System.out.print("\t");
			}
			
			for(int k=1;k<=i;k++){
				System.out.print(c+"\t");
				c--;
			}
			System.out.println();
			cnt=cnt+(i+1);
		}
	}
}

/*
                                1
                        3       2
                6       5       4
        10      9       8       7
15      14      13      12      11
*/