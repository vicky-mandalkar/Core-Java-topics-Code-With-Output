class Pyramid24{
	public static void main(String ar[]){
		int n=5;
		for(int i=1;i<=n;i++){
		if(i==5){
			for(int j=5;j>=1;j--){
				System.out.print(j);
			}
			for(int j=2;j<=5;j++){
				System.out.print(j);
			} 
			System.out.println(); 


		} 
		
		else{
			//first tri	
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
		//Space
			for(int s=1;s<(n-i)-3;s++){

				System.out.print(" ");
				
			}			

		//Sec Tri
			for(int j=1;j<=i;j++){
				System.out.print(j);

			}
			
			System.out.println();

		}
				
		

		}

	}

}
/*
5       5
44     44
333   333
2222 2222
111111111
*/