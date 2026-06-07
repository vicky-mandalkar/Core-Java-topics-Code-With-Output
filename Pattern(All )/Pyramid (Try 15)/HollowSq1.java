class HollowSq1{
	public static void main(String ar[]){
		int n=5;
		for(int i=1;i<=5;i++){
			if(i==1 || i==5){
				for(int j=1;j<=5;j++){
					System.out.print("*");
				}
				System.out.println();
			}
			else{
				for(int j=1;j<=5;j++){
					if(j==1 || j==5){
						System.out.print("*");	
					}else{
						System.out.print(" ");
					}
					
			
				}System.out.println();
			}

			
		}

	}


}
/*
*****
*   *
*   *
*   *
*****

12345
1   5
1   5
1   5
12345
*/