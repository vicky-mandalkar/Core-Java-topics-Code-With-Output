import java.util.Scanner;

class SUmOfTwoDArray{

	public static void main(String args[]){

        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter Row : ");
        	int row=sc.nextInt();
        
        	System.out.println("Enter Col : ");
        	int col=sc.nextInt();
        
        	int a[][]=new int[row][col];
       
       		System.out.println("===========Enter YOur Input Array===============");
       		for(int i=0;i<row;i++){
           		for(int j=0;j<col;j++){
                		System.out.println("Enter youe Element ["+i+"] ["+j+"] ");
                		a[i][j]=sc.nextInt();
            		}
        	}
        
        	System.out.println("=============Print Output=============");
            	for(int i=0;i<row;i++){
            		for(int j=0;j<col;j++){
                	System.out.print(a[i][j]+"\t" );
             
            		}
            		System.out.println();
        	}

            	System.out.println("=============Sum Of 2d Array=============");
            	int sum=0;
            	for(int i=0;i<row;i++){
                	for(int j=0;j<col;j++){
                    		sum=sum+a[i][j];
             
                	}
            	}
            	System.out.println(sum);  
    	}
}
/*
Enter Row :
3
Enter Col :
3
===========Enter YOur Input Array===============
Enter youe Element [0] [0]
1
Enter youe Element [0] [1]
2
Enter youe Element [0] [2]
3
Enter youe Element [1] [0]
4
Enter youe Element [1] [1]
5
Enter youe Element [1] [2]
6
Enter youe Element [2] [0]
7
Enter youe Element [2] [1]
8
Enter youe Element [2] [2]
9
=============Print Output=============
1       2       3
4       5       6
7       8       9
=============Sum Of 2d Array=============
45
*/