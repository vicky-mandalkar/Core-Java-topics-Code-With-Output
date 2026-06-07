class RanTri9{
	public static void main(String args[]){
		int n=5;
		int cnt=1;

		for(int i=1;i<=5;i++){
			int c=cnt;
			for(int j=1;j<i;j++){
				System.out.print("\t");

			}
			for(int k=i;k<=5;k++){
				System.out.print(c+"\t");
				c=c+k;
			}
			cnt=cnt+(i+1);
			System.out.println();
		}
	}
}
/*
1       2       4       7       11
        3       5       8       12
                6       9       13
                        10      14
                                15
*/