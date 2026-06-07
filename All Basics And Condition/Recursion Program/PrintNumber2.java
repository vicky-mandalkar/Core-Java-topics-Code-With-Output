import java.util.Scanner;
class PrintNumber2 {
  
    static void print(int n){
        
        if(1==n){
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        print(n-1);
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
12
11
10
9
8
7
6
5
4
3
2
1
*/