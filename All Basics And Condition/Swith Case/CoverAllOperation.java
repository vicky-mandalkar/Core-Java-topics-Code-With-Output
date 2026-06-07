import java.util.Scanner;

class CoverAllOperation {
    public static void main(String[] args) {
        int num,choice;
        char letter;
        
        
        
        Scanner sc=new Scanner(System.in);
    do{
        System.out.print("Enter n1 : ");
        num=sc.nextInt();
        
        int oriNum=num;
        
        System.out.println("****Menu****");
        System.out.println(" 1. Digit Stats \n 2. Boundary Sum \n 3. Digit Arithmetic \n 4. Mirror Check \n 5. Math Facts ");
        
       
        System.out.print("Enter your Choice : ");
        choice=sc.nextInt();
        
        switch(choice){
            case 1:
                int cnt=0;
                while(num>0){
                    int rem=num%10;
                    cnt++;
                    num=num/10;
                }
                System.out.println("Count of "+oriNum+" is :"+cnt);
                break;
                
            case 2:
                int Ldig=num%10;
                while(num>=9){
                    num=num/10;
                }
                System.out.println("First digit is : "+num);
                System.out.println("Last digt is : "+Ldig);
                System.out.println("Addition of First and Last digt is : "+(num+Ldig));
                
                break;
                
            case 3:
                int sum=0;
                int pro=1;
                while(num>0){
                    int rem=num%10;
                    sum=sum+rem;
                    pro=pro*rem;
                    num=num/10;
                }
                System.out.println("Sum of number "+oriNum+" is : "+sum);
                System.out.println("Product of number "+oriNum+" is : "+pro);
                break;
                
            case 4:
                int rev=0;
                while(num>0){
                    int rem=num%10;
                    rev=rev*10+rem;
                    num=num/10;
                }
                System.out.println("Reverse of number "+oriNum+" is : "+rev);
                System.out.println((rev==oriNum)?" is a palindrom ..!": " is not palindrom..!");
                // System.out.println("Product of number "+oriNum+" is : "+pro);
                break;
                
            case 5:
                int fact=1;//2345
               //System.out.print("Factors is : ");
                while(num>0){
                    int rem=num%10;
                    fact=fact*rem;
                    num=num/10;
                   // System.out.print(fact+" ");
                }
                System.out.println("factorial of this  number "+oriNum+" is : "+fact);
                
                break;
                
            default :
                System.out.println("you entered invalid ...!");
                
        }
         System.out.println("DO YOU WANT TO CONTINUE if yes enter Y or y ...");
         letter=sc.next().charAt(0);
     }
     while(letter=='Y' || letter=='y');
        System.out.print("----------END------------");
    
         
    }
}

/*
Enter n1 : 12345
****Menu****
 1. Digit Stats 
 2. Boundary Sum 
 3. Digit Arithmetic 
 4. Mirror Check 
 5. Math Facts 
Enter your Choice : 5
factorial of this  number 12345 is : 120
DO YOU WANT TO CONTINUE if yes enter Y or y ...
y
Enter n1 : 12345
****Menu****
 1. Digit Stats 
 2. Boundary Sum 
 3. Digit Arithmetic 
 4. Mirror Check 
 5. Math Facts 
Enter your Choice : 4
Reverse of number 12345 is : 54321
 is not palindrom..!
DO YOU WANT TO CONTINUE if yes enter Y or y ...
*/