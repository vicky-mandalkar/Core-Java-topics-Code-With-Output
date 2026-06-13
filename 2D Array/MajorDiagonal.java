

//  Write a Java program to find the sum of minor diagonal elements of a matrix


import java.util.Scanner;
class MajorDiagonal{
	
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

	

	public static void SumOfMajor(int arr[][]){
		System.out.println("================SUM OF MAJOR==============");
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i]==arr[j]){
					System.out.print(arr[i][j]+"\t");
					sum=sum+arr[i][j];
				}
			}	
		}
		System.out.println();
		System.out.println("Major Sum : "+sum);
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
		SumOfMajor(arr);

	}
}
/*
Enter Row
3
Enter Col
3
================ENTER INPUT ARRAY================
Enter Index i: 0 j : 0
6
Enter Index i: 0 j : 1
5
Enter Index i: 0 j : 2
1
Enter Index i: 1 j : 0
2
Enter Index i: 1 j : 1
44
Enter Index i: 1 j : 2
8
Enter Index i: 2 j : 0
9
Enter Index i: 2 j : 1
4
Enter Index i: 2 j : 2
3
================2D ARRAY================
6       5       1
2       44      8
9       4       3
================SUM OF MAJOR==============
6       44      3
Major Sum : 53
*/
