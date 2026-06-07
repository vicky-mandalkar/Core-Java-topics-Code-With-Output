class Pyramid6{
	public static void main(String args[]){
		int n=5;
		for(int i=5;i>=1;i--){
			//Space
			for(int j=1;j<i;j++){
				System.out.print(" ");

			}
			//first Tri
			for(int j=5;j>=i;j--){
				System.out.print(j);
			}
			 //Second tri i=2
			for(int j=i+1;j<=5;j++){
				System.out.print(j);
			} 
			
			System.out.println();
		}
	}

}
/*
    5
   545
  54345
 5432345
543212345

*/