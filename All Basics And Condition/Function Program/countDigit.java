import java.util.Scanner;
class countDigit {
    static int count(int n) {
        int cnt=0;
        while(n>0){
            int rem=n%10;
            cnt++;
            n=n/10;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
       int Count = count(num);
       System.out.println("Count of "+num+" is : "+Count);
    }
}
/*
Enter Number : 12345
Count of 12345 is : 5
*/