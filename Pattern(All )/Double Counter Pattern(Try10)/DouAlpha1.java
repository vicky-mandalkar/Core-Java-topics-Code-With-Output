class DouAlpha1{

	public static void main(String arg[]){

		int n=5;
		int cnt1=1;
		int cnt2=n*(n+1)/2;

		for(int i=1;i<=n;i++){
			int c1=cnt1;
			int c2=cnt2;
			

			for(int j=1;j<i;j++){
				System.out.print("\t");
			}

			for(int j1=5,j2=i ; j1>=i && j2<=5 ; j1--,j2++){
				//System.out.print(c1+" ");//-->1
 				//System.out.print(c2+"\t");//-->15					
				System.out.print((char)(64+c1)); 
				System.out.print((char)(64+c2)+"\t");
				c1=c1+j1;
				c2=c2-(j2+1);
			}
			System.out.println();
			cnt1++;
			cnt2=cnt2-i;
		
	
		}
	}
}
/*
AO      FM      JJ      MF      OA
        BN      GK      KG      NB
                CL      HH      LC
                        DI      ID
                                EE
*/

/*
1 15    6 13    10 10   13 6    15 1
        2 14    7 11    11 7    14 2
                3 12    8 8     12 3
                        4 9     9 4
                                5 5
*/