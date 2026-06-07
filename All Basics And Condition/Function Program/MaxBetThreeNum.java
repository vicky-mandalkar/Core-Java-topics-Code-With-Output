import java.util.Scanner;
class MaxBetThreeNum {
    static void  Maxi(int n1, int n2 ,int n3) {
       int res=((n1>n2 && n1>n3)? n1 : (n2>n3)?n2:n3);
       System.out.print(" maximum number is : "+res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Number 1 : ");
        int n1 = sc.nextInt();
        System.out.print(" Enter Number 2 : ");
        int n2 = sc.nextInt();
        System.out.print(" Enter Number 13 : ");
        int n3 = sc.nextInt();
        Maxi(n1,n2,n3);
       
    }
}
/*
 Enter Number 1 : 34
 Enter Number 2 : 89
 Enter Number 13 : 1
 maximum number is : 89
*/