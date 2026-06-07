import java.util.Scanner;
class FirstAndLastDigit {
    static void FirstLast(int n) {
        int temp=n;
        int LastDigit=n%10;
        while(n>10){
            //int rem=n%10;
            //cnt++;
            n=n/10;
        }
        int FirstDigit=n;
        System.out.println("First digit of "+temp+" is : "+FirstDigit);
        System.out.println("Last digit of  "+temp+" is : "+LastDigit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        FirstLast(num);
    //   int Count = count(num);
    //   System.out.println("Count of "+num+" is : "+Count);
    }
}
/*
Enter Number : 34567
First digit of 34567 is : 3
Last digit of  34567 is : 7
*/