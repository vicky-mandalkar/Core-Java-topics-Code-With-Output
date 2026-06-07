
import java.util.Scanner;
class SumOddNumber {
    static int OddSum(int n){
        if(n==0)
            return 0 ;
            
        if(n%2 !=0){
            return (n%10)+OddSum(n/10);
        }
        else{
           return OddSum(n/10);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number  : ");
        int num=sc.nextInt();
        System.out.print("Enter number  : "+OddSum(num));
       
    }
}