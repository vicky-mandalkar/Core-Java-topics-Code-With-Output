class DouTri16{
	public static void  main(String ar[]){
		int n=5;

		for(int i=5;i>=1;i--){
			
			for(int j=5;j>=1;j--){			

				if(j>=i){
					System.out.print(i);
				}
				else{
					System.out.print(j);
				}
			}
			System.out.println();
			
		}	
	}
			
}


/*
54321
44321
33321
22221
11111


5 4321
44 321
333 21
2222 1
11111
*/

