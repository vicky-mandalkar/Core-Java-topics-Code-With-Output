class Example2{
	public static void main(String args[]){
	
	for(int i=1;i<=5;i++){
		for(int j=5;j>=1;j--){
			//System.out.print(j +" ");	//1
			System.out.print("*");	//2
		}
		System.out.print(" ");

	 	for(int j=1;j<=5;j++){
			//System.out.print(j +" ");	//1
			System.out.print("*");	//2
		}
		System.out.println();

	}	

	}

}




/* 1
5 4 3 2 1  1 2 3 4 5
5 4 3 2 1  1 2 3 4 5
5 4 3 2 1  1 2 3 4 5
5 4 3 2 1  1 2 3 4 5
5 4 3 2 1  1 2 3 4 5
*/

/* 2
***** *****
***** *****
***** *****
***** *****
***** *****
*/
