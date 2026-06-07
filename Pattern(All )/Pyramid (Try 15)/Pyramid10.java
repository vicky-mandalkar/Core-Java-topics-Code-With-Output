class Pyramid10{
	public static void main(String ar[]){
		int n=5;
		for(int i=1;i<=n;i++){
		//Space
			for(int j=i;j<5;j++){
				System.out.print(" ");
			}

		//tri
			for(int j=1;j<=i*2-1;j++){
				System.out.print(n-i+1);
			}
			System.out.println();
		
		}
//----------------------------------------------
		for(int i=5;i>=1;i--){
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



	}


}
/*
    5
   444
  33333
 2222222
111111111
555555555
 4444444
  33333
   222
    1
*/