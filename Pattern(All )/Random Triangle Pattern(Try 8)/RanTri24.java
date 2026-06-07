class RanTri24{
	public static void main(String args[]){
		int n=5;
		int cnt=1;

		for(int i=n;i>=1;i--){
			int c=cnt; 
			for(int j=1;j<i;j++){
				System.out.print("\t");
			}
			
			for(int k=i;k<=5;k++){
				System.out.print(c+"\t");
				c=c-k;
			}
			System.out.println();
			cnt=cnt+i;
		}
	}
}

/*
                                1
                        6       2
                10      7       3
        13      11      8       4
15      14      12      9       5
*/