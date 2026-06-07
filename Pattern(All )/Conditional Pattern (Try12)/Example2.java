class Example2{
	public static void  main(String ar[]){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j%2==1){

					System.out.print("1");
				}
				else
				{
					System.out.print("0");					}
				
			}
			System.out.println();
		}
	}
}
/*
10101
10101
10101
10101
10101
*/