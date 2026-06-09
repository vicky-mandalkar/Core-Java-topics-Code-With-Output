//==> Write a Java program to subtract two matrices.

import java.util.Scanner;
class SubtractTwoMatrix{
	public static void main(String ar[]){

        	Scanner sc=new Scanner(System.in);

        	System.out.println("Enter Row : ");
        	int row=sc.nextInt();

        	System.out.println("Enter Col : ");
        	int col=sc.nextInt();
        
        	int matrix1[][]=new int[row][col];
        	int matrix2[][]=new int[row][col];
        	int result[][]=new int[row][col];
        
        	System.out.println("=====Enter input Matrix 1==========");
        	for(int i=0;i<row;i++){
            		for(int j=0;j<col;j++){
                		System.out.print("matrix1 : ["+i+"] ["+j+"] = ");
                		matrix1[i][j]=sc.nextInt();
            		}
        	}
        
        	System.out.println("=====Enter input Matrix 2==========");
        	for(int i=0;i<row;i++){
            		for(int j=0;j<col;j++){
                		System.out.print("matrix2 : ["+i+"] ["+j+"] = ");
                		matrix2[i][j]=sc.nextInt();
            		}
        	}
        
        	System.out.println("=====Display Matrix 1==========");
        	for(int i=0;i<row;i++){
            		for(int j=0;j<col;j++){
                		System.out.print(matrix1[i][j]+"\t");
            		}
            		System.out.println();
        	}
        
        	System.out.println("=====Display  Matrix 2==========");
        	for(int i=0;i<row;i++){
            		for(int j=0;j<col;j++){
                		System.out.print(matrix2[i][j]+"\t");
            		}
            		System.out.println();
        	}
        
       		//==>  Subtract Matrix
        	for(int i=0;i<row;i++){
            		for(int j=0;j<col;j++){
                		// System.out.print(matrix1[i][j]+"\t");
                		result[i][j]=matrix1[i][j] - matrix2[i][j];
            		}
        	}

        	System.out.println("=====After Subtracting two matrix  ==========");
        	for(int i=0;i<row;i++){
            		for(int j=0;j<col;j++){
                		System.out.print(result[i][j]+"\t");
            		}
            		System.out.println();
        	}
     	}
}
/*
Enter Row :
2
Enter Col :
2
=====Enter input Matrix 1==========
matrix1 : [0] [0] = 15
matrix1 : [0] [1] = 56
matrix1 : [1] [0] = 52
matrix1 : [1] [1] = 2
=====Enter input Matrix 2==========
matrix2 : [0] [0] = 45
matrix2 : [0] [1] = 23
matrix2 : [1] [0] = 86
matrix2 : [1] [1] = 23
=====Display Matrix 1==========
15      56
52      2
=====Display  Matrix 2==========
45      23
86      23
=====After Subtracting two matrix  ==========
-30     33
-34     -21
*/
