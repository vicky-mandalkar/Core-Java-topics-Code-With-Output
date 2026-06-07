import java.util.Scanner;
class CoverAllOperation2 {
    public static void main(String[] args) {
        int n,choice;
        //char letter;
        
        
        
        Scanner sc=new Scanner(System.in);
   // do{
        System.out.print("Enter number : ");
        n=sc.nextInt();
        
        // int oriNum=num;
        
        System.out.println("****Menu****");
        System.out.println(" 1. Right Angle Triangle \n 2. Mirrored Right Triangle \n 3. Inverted Right Triangle \n");
        
       
        System.out.print("Enter your Choice : ");
        choice=sc.nextInt();
        
        switch(choice){
         
            
            case 1:
                System.out.println("Solid :");
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
        
                 // int n=5;
                 System.out.println("--------------------------");
        
                System.out.println("Hollow :");
                for(int i=1;i<=n;i++){
                     for(int j=1;j<=i;j++){
                         if(i==1 || i==n || j==1 || j==i){
                         System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
                
            case 2 :
                System.out.println("Solid :");
                for(int i=1;i<=n;i++){
                    for(int j=n;j>i;j--){
                        System.out.print(" ");
                    }
                   
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
        
                System.out.println("-------------------");
        
                System.out.println("Hollow :");
                for(int i=1;i<=n;i++) {
                    for(int s=1;s<n-i;s++) {
                        System.out.print(" ");
                    }
            
                    for(int j=1;j<=i;j++) {
                        if(i==n || j==1 || j==i || i==1) {
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }

                    System.out.println();
                }
                break;
                
            case 3 :
                    System.out.println("Solid :");
                    for(int i=1;i<=n;i++){
                        for(int j=n;j>=i;j--){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
        
                    System.out.println("-------------------");
        
                    System.out.println("Hollow :");
                    for(int i=1;i<=n;i++){
                        for(int j=n;j>=i;j--){
                            if(i==1 || i==n || j==i || j==n){
                                System.out.print("*");
                            }
                            else{
                                System.out.print(" ");
                            }
               
                        } System.out.println();
            
                    }
                    break;
                
                
                
            default :
                System.out.println("you entered invalid ...!");
                
        }
    //      System.out.println("DO YOU WANT TO CONTINUE if yes enter Y or y ...");
    //      letter=sc.next().charAt(0);
    //  }
    //  while(letter=='Y' || letter=='y');
    //     System.out.print("----------END------------");
    
         
    }
}