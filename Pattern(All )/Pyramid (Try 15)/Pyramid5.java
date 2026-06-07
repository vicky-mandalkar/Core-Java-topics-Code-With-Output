class Pyramid5{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=n;i++){
			//Space
			for(int j=i;j<5;j++){
				System.out.print(" ");

			}
			//first Tri
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			//Second tri
			for(int j=i-1;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
/*
    1
   121
  12321
 1234321
123454321
*/