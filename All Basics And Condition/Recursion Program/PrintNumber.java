import java.util.Scanner;
class PrintNumber {
  
    static void print(int n){
        
        if(1==n){
            System.out.println(n);
            return ;
        }
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int num=sc.nextInt();
        print(num);
    }
}
/*
Enter your Number : 12
1
2
3
4
5
6
7
8
9
10
11
12
*/