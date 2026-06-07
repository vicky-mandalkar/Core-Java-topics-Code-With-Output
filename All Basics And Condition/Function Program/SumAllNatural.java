import java.util.Scanner;

class SumAllNatural {

    static int  sum(int n) {
        int i=1;
        int sum=0;
        while(i <= n) {
            sum=sum+i;
            i++;
        }
        return sum;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  number: ");

        int num = sc.nextInt();

        int result=sum(num);
        System.out.print("The sum is all natural number : "+result);
    }
}
/*
Enter  number: 10
The sum is all natural number : 55
*/