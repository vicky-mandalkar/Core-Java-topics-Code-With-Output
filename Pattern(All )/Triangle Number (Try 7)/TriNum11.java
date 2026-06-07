class TriNum11{
 	public static void main(String args[]){
 		int n=5;
		int cnt=(n*(n-1)/2)+1;
		
		for(int i=n;i>=1;i--){
			int c=cnt;

			for(int j=i;j<=n;j++){
				System.out.print(c+"\t");
				c=c+j+1;
			}
			cnt=cnt-(i-1);
			System.out.println();


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