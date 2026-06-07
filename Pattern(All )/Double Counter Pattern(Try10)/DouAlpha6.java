class DouAlpha6{

	public static void main(String args[]){

		int n=5;
		int cnt1=5;
		int cnt2=5;
		for(int i1=5 , i2=1; i1>=1 && i2<=5; i1--, i2++){
			int c1=cnt1;
			int c2=cnt2;
			for(int j1=1, j2=5 ;j1<=i1 && j2>=i2;j1++, j2--){
				//System.out.print(c1+" ");
				//System.out.print(c2+"\t");
				System.out.print((char)(64+c1));
				System.out.print((char)(64+c2)+"\t");
				c1--;
				c2=c2+j2-1;
				
			}
			cnt1=cnt1+i1-1;
			cnt2--;
			System.out.println();
		}
	}
}
/*
EE      DI      CL      BN      AO
ID      HH      GK      FM
LC      KG      JJ
NB      MF
OA
*/

/*
5 5     4 9     3 12    2 14    1 15
9 4     8 8     7 11    6 13
12 3    11 7    10 10
14 2    13 6
15 1
*/