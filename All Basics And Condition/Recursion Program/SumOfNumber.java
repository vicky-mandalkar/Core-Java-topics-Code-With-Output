import java.util.Scanner;
class SumOfNumber {
  
    static int  sum(int n){
        
        if(n==1)
            return 1 ;
        
        return n+sum(n-1);
    }
    public static void main(String[] args) {
         int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Number : ");
        n=sc.nextInt();
        System.out.print(sum(n));
        
    }
}
/*
Enter your Number : 10
55
*/