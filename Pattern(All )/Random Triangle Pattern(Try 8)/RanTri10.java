class RanTri10{
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
				c=c+(k+1);
			}
			cnt=cnt+i;
			System.out.println();
		}
	}
}
/*
1       3       6       10      15
        2       5       9       14
                4       8       13
                        7       12
                                11
*/