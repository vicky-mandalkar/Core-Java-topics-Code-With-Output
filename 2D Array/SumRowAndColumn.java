<<<<<<< HEAD
//  Write a Java program to find the sum of each row and column of a matrix.

import java.util.Scanner;
class SumRowAndColumn{
	
	public static void Input2D(int arr[][],Scanner sc){
		System.out.println("================ENTER INPUT ARRAY================");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter Index i: "+i+" j : "+j);
				arr[i][j]=sc.nextInt();
			}
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

	public static void SumOfRow(int arr[][]){
		System.out.println("================SUM OF ROW===============");
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=0;j<arr[i].length;j++){
				sum=sum+arr[i][j];
			}
			System.out.println("Row Of "+i+" Sum is : "+sum);
		}
	}

	public static void SumOfColumn(int arr[][]){
		System.out.println("================SUM OF COLUMN===============");
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=0;j<arr[i].length;j++){
				sum=sum+arr[j][i];
			}
			System.out.println("Column Of "+i+" Sum is : "+sum);
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
		SumOfRow(arr);
		SumOfColumn(arr);

	}
}
/*
Enter Row
3
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
Enter Index i: 2 j : 0
7
Enter Index i: 2 j : 1
8
Enter Index i: 2 j : 2
9
================2D ARRAY================
1       2       3
4       5       6
7       8       9
================SUM OF ROW===============
Row Of 0 Sum is : 6
Row Of 1 Sum is : 15
Row Of 2 Sum is : 24
================SUM OF COLUMN===============
Column Of 0 Sum is : 12
Column Of 1 Sum is : 15
Column Of 2 Sum is : 18
*/
=======
//  Write a Java program to find the sum of each row and column of a matrix.

import java.util.Scanner;
class SumRowAndColumn{
	
	public static void Input2D(int arr[][],Scanner sc){
		System.out.println("================ENTER INPUT ARRAY================");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter Index i: "+i+" j : "+j);
				arr[i][j]=sc.nextInt();
			}
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

	public static void SumOfRow(int arr[][]){
		System.out.println("================SUM OF ROW===============");
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=0;j<arr[i].length;j++){
				sum=sum+arr[i][j];
			}
			System.out.println("Row Of "+i+" Sum is : "+sum);
		}
	}

	public static void SumOfColumn(int arr[][]){
		System.out.println("================SUM OF COLUMN===============");
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=0;j<arr[i].length;j++){
				sum=sum+arr[j][i];
			}
			System.out.println("Column Of "+i+" Sum is : "+sum);
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
		SumOfRow(arr);
		SumOfColumn(arr);

	}
}
/*
Enter Row
3
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
Enter Index i: 2 j : 0
7
Enter Index i: 2 j : 1
8
Enter Index i: 2 j : 2
9
================2D ARRAY================
1       2       3
4       5       6
7       8       9
================SUM OF ROW===============
Row Of 0 Sum is : 6
Row Of 1 Sum is : 15
Row Of 2 Sum is : 24
================SUM OF COLUMN===============
Column Of 0 Sum is : 12
Column Of 1 Sum is : 15
Column Of 2 Sum is : 18
*/
>>>>>>> 209d7a204d30a9b82fd17bcc52287fc7f1b2cf9a
