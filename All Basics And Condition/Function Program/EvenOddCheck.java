import java.util.Scanner;
class EvenOddCheck{
    static void  evenodd(int n ) {
       System.out.print((n%2==0)? n+" is even number" : n+" is Odd Number ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Number to check even or odd : ");
        int num = sc.nextInt();
       evenodd(num);
       
    }
}
/*
 Enter Number to check even or odd : 12
12 is even number
*/