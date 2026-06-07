class Example7{
	public static void  main(String ar[]){
		int n=5;
		char ch='A';
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i%2!=0){

					System.out.print("1");
				}
				else
				{
					System.out.print(ch);					}		
			}
			if(i%2==0){
				ch++;
			}
			System.out.println();
		}
	}
}
/*
11111
AAAAA
11111
BBBBB
11111

*/

