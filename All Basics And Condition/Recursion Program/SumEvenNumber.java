
import java.util.Scanner;
class SumEvenNumber {
    static int EvenSum(int n){
        if(n==0)
            return 0 ;
            
        if(n%2==0){
            return (n%10)+EvenSum(n/10);
        }
        else{
           return EvenSum(n/10);
        }
            
        // pattern(n-1);
        // System.out.print("*");
        // pattern(n+1);
        // System.out.println( );

        //pattern(n-1);
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number  : ");
        int num=sc.nextInt();
        System.out.print("Enter number  : "+EvenSum(num));
       
    }
}