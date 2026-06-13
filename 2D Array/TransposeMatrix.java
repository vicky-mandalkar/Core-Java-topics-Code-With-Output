//Write a program to transpose matrix 

import java.util.Scanner;
class TransposeMatrix{
	
	public static void Input2D(int arr[][],Scanner sc){
		System.out.println("================ENTER INPUT ARRAY================");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter Index i: "+i+" j : "+j);
				arr[i][j]=sc.nextInt();
			}
			System.out.println();

		}
	}
	
	public static void Print2DArray(int arr[][]){
		System.out.println("================2D ARRAY================");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

	

	public static int[][] transpose(int arr[][]){		
		int rows = arr.length;
        	int cols = arr[0].length;

		int transpose[][] = new int[cols][rows];

		for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                		transpose[j][i] = arr[i][j];
            		}
        	}
        	return transpose;
	}

	public static void PrintTranspose(int arr[][]){
		System.out.println("================Print Aftar Transpose===============");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		int row,col;

		System.out.println("Enter Row  ");
		row=sc.nextInt();

		
		System.out.println("Enter Col  ");
		col=sc.nextInt();

		int arr[][]=new int[row][col];

		Input2D(arr,sc);
		Print2DArray(arr);	
        	int result[][] = transpose(arr);   // ✅ store result
        	PrintTranspose(result);  

	}
}
/*


Enter Row
2
Enter Col
3
================ENTER INPUT ARRAY================
Enter Index i: 0 j : 0
1
Enter Index i: 0 j : 1
2
Enter Index i: 0 j : 2
3

Enter Index i: 1 j : 0
4
Enter Index i: 1 j : 1
5
Enter Index i: 1 j : 2
6

================2D ARRAY================
1       2       3
4       5       6
================Print Aftar Transpose===============
1       4
2       5
3       6
	*/
