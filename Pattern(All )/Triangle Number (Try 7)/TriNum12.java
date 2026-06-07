class TriNum12{
 	public static void main(String args[]){
 		int n=5;
		int cnt=n*(n+1)/2;
		
		for(int i=n;i>=1;i--){
			int c=cnt;

			for(int j=i;j<=n;j++){
				System.out.print(c+"\t");
				c=c+j;
			}
			cnt=cnt-i;
			System.out.println();


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
/*
i
4 
3 4
2 3 4 
1 2 3 4

j
5 
4 5
3 4 5
2 3 4 5
*/