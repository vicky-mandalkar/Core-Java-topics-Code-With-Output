class HolloPyramid1{
	public static void main(String ar[]){
		int n=5;
		for(int i=n;i>=1;i--){

		if(i==n){
			for(int j=1;j<=n;j++){
				System.out.print(j);

			}
			for(int j=n-1;j>=1;j--){
				System.out.print(j);

			}

		}
		else{
			//First Tri
			for(int j=1;j<=i;j++){
				System.out.print(j);

			}
		//Space
			for(int s=1;s<(n-i)*2;s++){

				System.out.print(" ");
	
			}

		//Sec Tri
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}

		}
		
			System.out.println();
		} 
//===============================================
		//int n=5;
		for(int i=2;i<=n;i++){
		if(i==n){
			for(int j=1;j<=n;j++){
				System.out.print(j);
			}
			for(int j=n-1;j>=1;j--){
				System.out.print(j);
			} 
			System.out.println(); 


		} 
		
		else{
			//first tri	
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
		//Space
			for(int s=1;s<(n-i)*2;s++){

				System.out.print(" ");
			}			

		//Sec Tri
			for(int j=i;j>=1;j--){
				System.out.print(j);

			}
			
			System.out.println();

		}
				
		}
	}
}

/*
123454321
1234 4321
123   321
12     21
1       1
12     21
123   321
1234 4321
123454321
*/