class Pyramid21{
	public static void main(String ar[]){
		int n=5;
		for(int i=5;i>=1;i--){
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
			for(int s=2;s<=(n-i)*2;s++){

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
543212345
4321  1234
321    123
21      12
1        1
*/