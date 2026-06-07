class HolloPyramid2{
	public static void main(String ar[]){
		int n=5;
		for(int i=1;i<=n;i++){
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
				
				for(int s=1;s<(i-1)*2;s++){
					System.out.print(" ");
				}
				
				for(int j=i;j<=5;j++){
					System.out.print(i);
				}
				System.out.println();
			

			}
		} 
//==========================================================
		//int n=5;
		for(int i=n-1;i>=1;i--){
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
				for(int j=5;j>=i;j--){
					System.out.print(i);
				}

				for(int s=1;s<=(i*2)-3;s++){
					System.out.print(" ");
				}
			
				for(int j=i;j<=n;j++){
					System.out.print(i);
				}
				System.out.println();

			}

		}
	}
}

/*
111111111
2222 2222
333   333
44     44
5       5
44     44
333   333
2222 2222
111111111
*/