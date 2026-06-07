class DouAlpha5{

	public static void main(String arg[]){

		int n=5;
		int cnt1=5;
		int cnt2=1;

		for(int i1=5,i2=1;i1>=1 && i2<=5;i1--, i2++){
			int c1=cnt1;
			int c2=cnt2;
			
			for(int j1=1, j2=i2 ; j1<=i1 && j2<=5 ; j1++ ,j2++){
				System.out.print(c1+" ");//-->15
 				System.out.print(c2+"\t");//-->15					
				//System.out.print((char)(64+c1));
				//System.out.print((char)(96+c2)+"\t");
				c1--;
				c2=c2+j2;
			}
			System.out.println();
			cnt1=cnt1+i1-1;
			cnt2=cnt2+i2+1;
		
	
		}
	}
}
/*
Ea      Db      Cd      Bg      Ak
Ic      He      Gh      Fl
Lf      Ki      Jm
Nj      Mn
Oo
*/

/*
5 1     4 2     3 4     2 7     1 11
9 3     8 5     7 8     6 12
12 6    11 9    10 13
14 10   13 14
15 15
*/

