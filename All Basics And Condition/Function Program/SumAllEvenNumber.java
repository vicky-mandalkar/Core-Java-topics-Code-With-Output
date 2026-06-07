import java.util.Scanner;

class SumAllEvenNumber {

    static int  Evensum(int n) {
        int i=1;
        int sum=0;
        while(i <= n) {
            if(i%2==0){
                sum=sum+i;
            }
            i++;
            
        }
        return sum;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  number: ");

        int num = sc.nextInt();

        int result=Evensum(num);
        System.out.print("The sum is all Even number : "+result);
    }
}
/*
Enter  number: 10
The sum is all Even number : 30
*/