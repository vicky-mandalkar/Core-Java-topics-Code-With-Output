class Pyramid23{
	public static void main(String ar[]){
		int n=5;
		for(int i=5;i>=1;i--){
		if(i==1){
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
			for(int j=5;j>=i;j--){
				System.out.print(j);
			}
		//Space
			for(int s=2;s<(2*i)-1;s++){

				System.out.print(" ");
			}			

		//Sec Tri
			for(int j=i;j<=5;j++){
				System.out.print(j);

			}
			
			System.out.println();

		}
				
		

		}

	}

}
/*
5       5
54     45
543   345
5432 2345
543212345
*/