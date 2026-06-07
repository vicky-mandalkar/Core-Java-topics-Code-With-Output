class Pyramid22{
	public static void main(String ar[]){
		int n=5;
		for(int i=5;i>=1;i--){
		if(i==1){
			for(int j=1;j<=5;j++){
				System.out.print(j);
			}
			for(int j=4;j>=1;j--){
				System.out.print(j);
			} 
			System.out.println(); 


		} 
		
		else{
			//first tri	
			for(int j=i;j<=5;j++){
				System.out.print(j);
			}
		//Space
			for(int s=2;s<(2*i)-1;s++){

				System.out.print(" ");
			}			

		//Sec Tri
			for(int j=5;j>=i;j--){
				System.out.print(j);

			}
			
			System.out.println();

		}
				
		

		}

	}

}
/*
5       5
45     54
345   543
2345 5432
123454321
*/