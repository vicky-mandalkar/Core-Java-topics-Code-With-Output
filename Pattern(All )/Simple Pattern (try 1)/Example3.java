class Example3{
	public static void main (String args[]){

		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=5;j++){
				//System.out.print(j+" ");	//1
				System.out.print("*");	//2
			}

			System.out.print(" ");
			for(int j=1;j<=5;j++){
				//System.out.print(j+" ");	//1
				System.out.print("*");	//2
			}

			System.out.print(" ");
			for(int j=1;j<=5;j++){
				//System.out.print(j+" ");	//1
				System.out.print("*"); 	//2
			}

			System.out.println(); 
	}

		}

}
/* 2
***** ***** *****
***** ***** *****
***** ***** *****
***** ***** *****
***** ***** *****
*/

/* 1
1 2 3 4 5  1 2 3 4 5  1 2 3 4 5
1 2 3 4 5  1 2 3 4 5  1 2 3 4 5
1 2 3 4 5  1 2 3 4 5  1 2 3 4 5
1 2 3 4 5  1 2 3 4 5  1 2 3 4 5
1 2 3 4 5  1 2 3 4 5  1 2 3 4 5
*/