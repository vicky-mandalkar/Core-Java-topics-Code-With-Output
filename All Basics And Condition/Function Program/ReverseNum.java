import java.util.Scanner;
class ReverseNum {
    static void Reverse(int n) {
        int temp=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println("reverse of  "+temp+"  is : "+rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        Reverse(num);
    //   int Count = count(num);
    //   System.out.println("Count of "+num+" is : "+Count);
    }
}
/*
Enter Number : 234567
reverse of  234567  is : 765432
*/