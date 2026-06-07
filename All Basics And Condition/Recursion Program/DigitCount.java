import java.util.Scanner;
class DigitCount{
    static int digit(int n){
        if(n==0)
            return 0;
       
        return 1+digit(n/10);
    }
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter your Number : ");
       int num=sc.nextInt();
       System.out.print(digit(num));
       
    }
}
/*
Enter your Number : 12345
5
*/