import java.util.Scanner;
class palindromeCheck  {
    static void palindrome(int n) {
        int temp=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println((temp==rev)?" is Palindron number...!" : "is Not Palindrom Number...! ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        palindrome(num);
    //   int Count = count(num);
    //   System.out.println("Count of "+num+" is : "+Count);
    }
}
/*
Enter Number : 1234321
 is Palindron number...!
*/