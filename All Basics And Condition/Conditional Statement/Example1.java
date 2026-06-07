import java.util.Scanner;
class Example1{
	public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        
        num=sc.nextInt();
        
        if(num>0){
            System.out.println("Positive number:" +num);
        }
        
        if(num<0){
            System.out.println("negative number"+num);
        }
        if(num==0){
            System.out.println("Zero number" + num);
        }
    System.out.println("----------------------");
        if(num>0){
            System.out.println("Positive Number" +num);
        }
        else{
            System.out.println("Negative number" +num);
        }
        
        if(num>0){
            System.out.println("Positive number" +num);
        }
        else{
            if(num<0){
                System.out.println("Positive number:" +num);
            }
            else if(num<0){
                System.out.println("Negative number" +num);
            }
            else{
                System.out.println("positive number:" +num);
            }
        }
    }



}

    