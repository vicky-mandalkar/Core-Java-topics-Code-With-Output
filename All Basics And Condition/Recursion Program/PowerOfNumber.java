
import java.util.Scanner;

class PowerOfNumber{
  
    static int power(int n1,int n2){
        if(n2==0)
            return 1;
        
        return n1 * power(n1,n2-1);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.print("Enter Base value : ");
       int n1=sc.nextInt();
       System.out.print("Enter Power : ");
       int n2=sc.nextInt();
       int c=power(n1,n2);
       System.out.print("power of  Number is  : "+c);
    }
}
/*
Enter Base value : 5
Enter Power : 5
power of  Number is  : 3125
*/