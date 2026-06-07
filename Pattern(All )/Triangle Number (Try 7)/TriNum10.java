

class TriNum10{
	public static void  main (String ar[]){
		int n=5;
		int cnt=n;
		
		for(int i=5;i>=1;i--){
			int c=cnt;

			for(int j=i;j<=n;j++){
				System.out.print(c+"\t");
				c=c-j-1;

			}
			cnt=cnt+i-1;
			System.out.println();
		}
	}
}

/*
5
9       4
12      8       3
14      11      7       2
15      13      10      6       1
*/

/*i
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