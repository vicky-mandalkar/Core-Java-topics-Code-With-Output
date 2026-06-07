class Example5{
	public static void  main(String ar[]){
		int n=5;
		for(int i=5;i>=1;i--){
			for(int j=1;j<=n;j++){
				if(j%2==1){

					System.out.print((char)(64+j));
				}
				else
				{
					System.out.print((char)(96+j));					}
				
			}
			System.out.println();
		}
	}
}
/*
AbCdE
AbCdE
AbCdE
AbCdE
AbCdE
*/