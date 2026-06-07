class DouAlpha3{

	public static void main(String arg[]){

		int n=5;
		int cnt1=5;
		int cnt2=n*(n+1)/2;

		for(int i=5;i>=1;i--){
			int c1=cnt1;
			int c2=cnt2;
			for(int j=i;j>1;j--){
				System.out.print("\t");
			}

			for(int j1=i;j1<=5;j1++){
				//System.out.print(c1+ " ");
				//System.out.print(c2+"\t");
				System.out.print((char)(64+c1));
				System.out.print((char)(64+c2)+"\t");
				c1=c1-(j1+1);
				c2=c2+j1;
			}
			cnt1=cnt1+i-1;
			cnt2=cnt2-i;
			System.out.println();
		}


	}
}
/*
                                EO
                        IJ      DN
                LF      HI      CM
        NC      KE      GH      BL
OA      MB      JD      FG      AK
*/

/*
                                5 15
                        9 10    4 14
                12 6    8 9     3 13
        14 3    11 5    7 8     2 12
15 1    13 2    10 4    6 7     1 11
*/