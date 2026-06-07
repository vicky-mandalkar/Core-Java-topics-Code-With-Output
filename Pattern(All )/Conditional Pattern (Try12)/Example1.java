class Example1{
	public static void  main(String ar[]){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i%2==1){

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
11111
00000
11111
00000
11111
*/