class DouAlpha2{

	public static void main(String arg[]){

		int n=5;
		int cnt1=n*(n+1)/2;
		int cnt2=n*(n+1)/2;

		for(int i=1;i<=n;i++){
			int c1=cnt1;
			int c2=cnt2;
			

			
			for(int j1=i,j2=5 ; j1<=5 && j2>=i ; j1++,j2--){
				System.out.print(c1+" ");//-->15
 				System.out.print(c2+"\t");//-->15					
				//System.out.print((char)(64+c1));
				//System.out.print((char)(64+c2)+"\t");
				c1=c1-j1;
				c2=c2-j2;
			}
			System.out.println();
			cnt1=cnt1-(i+1);
			cnt2--;
		
	
		}
	}
}
/*
OO      NJ      LF      IC      EA
MN      KI      HE      DB
JM      GH      CD
FL      BG
AK
*/

/*
15 15   14 10   12 6    9 3     5 1
13 14   11 9    8 5     4 2
10 13   7 8     3 4
6 12    2 7
1 11
*/