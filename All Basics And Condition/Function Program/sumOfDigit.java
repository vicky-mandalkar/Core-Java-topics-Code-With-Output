import java.util.Scanner;
class sumOfDigit {
    static void DigitSum(int n) {
        int temp=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Sum of  "+temp+" digit is : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        DigitSum(num);
    //   int Count = count(num);
    //   System.out.println("Count of "+num+" is : "+Count);
    }
}
/*
Enter Number : 12345
Sum of  12345 digit is : 15
*/