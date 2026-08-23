<<<<<<< HEAD
//==>  Write a Java program to add two matrices.

import java.util.Scanner;
class AddTwoMatrix{
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
        
       		//==>  Addition Matrix
        	for(int i=0;i<row;i++){
            		for(int j=0;j<col;j++){
                		// System.out.print(matrix1[i][j]+"\t");
                		result[i][j]=matrix1[i][j] + matrix2[i][j];
            		}
        	}

        	System.out.println("=====After adding two matrix  ==========");
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
3
Enter Col :
3
=====Enter input Matrix 1==========
matrix1 : [0] [0] = 10
matrix1 : [0] [1] = 20
matrix1 : [0] [2] = 30
matrix1 : [1] [0] = 40
matrix1 : [1] [1] = 50
matrix1 : [1] [2] = 60
matrix1 : [2] [0] = 70
matrix1 : [2] [1] = 80
matrix1 : [2] [2] = 90
=====Enter input Matrix 2==========
matrix2 : [0] [0] = 10
matrix2 : [0] [1] = 20
matrix2 : [0] [2] = 30
matrix2 : [1] [0] = 40
matrix2 : [1] [1] = 50
matrix2 : [1] [2] = 60
matrix2 : [2] [0] = 70
matrix2 : [2] [1] = 80
matrix2 : [2] [2] = 90
=====Display Matrix 1==========
10      20      30
40      50      60
70      80      90
=====Display  Matrix 2==========
10      20      30
40      50      60
70      80      90
=====After adding two matrix  ==========
20      40      60
80      100     120
140     160     180
=======
//==>  Write a Java program to add two matrices.

import java.util.Scanner;
class AddTwoMatrix{
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
        
       		//==>  Addition Matrix
        	for(int i=0;i<row;i++){
            		for(int j=0;j<col;j++){
                		// System.out.print(matrix1[i][j]+"\t");
                		result[i][j]=matrix1[i][j] + matrix2[i][j];
            		}
        	}

        	System.out.println("=====After adding two matrix  ==========");
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
3
Enter Col :
3
=====Enter input Matrix 1==========
matrix1 : [0] [0] = 10
matrix1 : [0] [1] = 20
matrix1 : [0] [2] = 30
matrix1 : [1] [0] = 40
matrix1 : [1] [1] = 50
matrix1 : [1] [2] = 60
matrix1 : [2] [0] = 70
matrix1 : [2] [1] = 80
matrix1 : [2] [2] = 90
=====Enter input Matrix 2==========
matrix2 : [0] [0] = 10
matrix2 : [0] [1] = 20
matrix2 : [0] [2] = 30
matrix2 : [1] [0] = 40
matrix2 : [1] [1] = 50
matrix2 : [1] [2] = 60
matrix2 : [2] [0] = 70
matrix2 : [2] [1] = 80
matrix2 : [2] [2] = 90
=====Display Matrix 1==========
10      20      30
40      50      60
70      80      90
=====Display  Matrix 2==========
10      20      30
40      50      60
70      80      90
=====After adding two matrix  ==========
20      40      60
80      100     120
140     160     180
>>>>>>> 209d7a204d30a9b82fd17bcc52287fc7f1b2cf9a
*/