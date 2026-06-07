class Pyramid9{
	public static void main(String ar[]){
		int n=5;
		for(int i=1;i<=n;i++){
		//Space
			for(int j=i;j<5;j++){
				System.out.print(" ");
			}

		//tri
			for(int j=1;j<=i*2-1;j++){
				System.out.print(i);
			}
			System.out.println();
		
		}
//----------------------------------------------
		for(int i=5;i>=1;i--){
		//Space
			for(int j=5;j>i;j--){
				System.out.print(" ");
			}

		//tri
			for(int j=1;j<=i*2-1;j++){
				System.out.print(n-i+1);
			}
			System.out.println();
		
		}



	}

}
/*
   1
   222
  33333
 4444444
555555555
111111111
 2222222
  33333
   444
    5
*/