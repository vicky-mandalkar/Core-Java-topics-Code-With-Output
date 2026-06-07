
import java.util.Scanner;

class MultiplicationOfTwoNumber{
  
    static int Multiplication(int a,int b){
        if(b==0)
            return 0;
        
        return a + Multiplication(a,b-1);
    }
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter first No : ");
       int n1=sc.nextInt();
       System.out.print("Enter Second No : ");
       int n2=sc.nextInt();
       int c=Multiplication(n1,n2);
       System.out.print("Multiplication of two   Number is  : "+c);
    }
}
/*
Enter first No : 12
Enter Second No : 3
Multiplication of two   Number is  : 36
*/