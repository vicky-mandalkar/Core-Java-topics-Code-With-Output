class DouAlpha4{

	public static void main(String arg[]){

		int n=5;
		int cnt1=n*(n+1)/2;
		int cnt2=1;

		for(int i1=5,i2=1;i1>=1 && i2<=5;i1--,i2++){
			int c1=cnt1;
			int c2=cnt2;
			for(int j=i1;j>1;j--){
				System.out.print("\t");
			}

			for(int j1=i1,j2=1;j1<=5 && j2<=i2;j1++){
				//System.out.print(c1+" ");
				//System.out.print(c2+"\t");
				System.out.print((char)(64+c1));
				System.out.print((char)(64+c2)+"\t");
				c1=c1+j1;
				c2=c2-j2;
			}
			cnt1=cnt1-i1;
			cnt2=cnt2+i2+1;
			System.out.println();
		}


	}
}
/*
                                OA
                        JC      NB
                FF      IE      MD
        CJ      EI      HH      LG
AO      BN      DM      GL      KK
*/

/*
                                15 1
                        10 3    14 2
                6 6     9 5     13 4
        3 10    5 9     8 8     12 7
1 15    2 14    4 13    7 12    11 11
*/