class HolloPyramid3{
	public static void main(String ar[]){
		int n=5;
		
		 for(int i=5;i>=1;i--){
			if(i==1){
				for(int j=1;j<=n;j++){
					System.out.print(i);
				}
				for(int j=n-1;j>=1;j--){
					System.out.print(i);
				}
				System.out.println();
			}
			else{
				for(int j=i;j<=5;j++){
					System.out.print(i);
				}
				
			
				for(int s=1;s<=(i*2)-3;s++){
					System.out.print(" ");
				}

				for(int j=5;j>=i;j--){
					System.out.print(i);
				}
				System.out.println();


			}
		} 
//==================================================
		for(int i=2;i<=5;i++){
			for(int j=i;j<=5;j++){
				System.out.print(i);
			}
			
			for(int s=2;s<(2*i)-1;s++){
				System.out.print(" ");
			}
			
			for(int j=i;j<=5;j++){
				System.out.print(i);

			}
			System.out.println();
		}
		
	}


}
/*
5       5
44     44
333   333
2222 2222
111111111
2222 2222
333   333
44     44
5       5
*/
