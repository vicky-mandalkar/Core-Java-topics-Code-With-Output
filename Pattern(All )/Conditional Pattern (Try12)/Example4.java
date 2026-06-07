class Example4{
	public static void  main(String ar[]){
		int n=5;
		for(int i=5;i>=1;i--){
			for(int j=1;j<=n;j++){
				if(i%2==1){

					System.out.print((char)(64+i));
				}
				else
				{
					System.out.print((char)(96+i));					}
				
			}
			System.out.println();
		}
	}
}
/*
EEEEE
ddddd
CCCCC
bbbbb
AAAAA
*/