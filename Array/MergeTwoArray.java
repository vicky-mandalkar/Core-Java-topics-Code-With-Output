
class MergeTwoArray {
    public static void main(String[] args) {
      int arr1[]={1,2,3,5,7,9,12};
      int arr2[]={5,6,46,8,97,5,4};
      int arr3[]=new int[arr1.length + arr2.length];
      int index=0;
      for(int i=0;i<arr1.length;i++){
          arr3[index]=arr1[i];
          index++;
      }
      for(int i=0;i<arr2.length;i++){
          arr3[index]=arr2[i];
          index++;
      }
      for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]+"\t"+i);
      }
    }
}  
/*
class Reverse {
    public static void main(String[] args) {
      int arr1[]={1,2,3,5,7,9,12};
      int arr2[]=new int[arr1.length];
      int index=0;
      for(int i=arr1.length-1;i>=0;i--){
          arr2[index]=arr1[i];
          index++;
      }
      for(int i=0;i<arr2.length;i++){
          System.out.println(arr2[i]+"\t"+i);
      }
    }
}   


class MoveZero {
    public static void main(String[] args) {
      int arr1[]={1, 0, 5, 0, 3, 0, 2};
      int j=0;
       
      for(int i=0;i<arr1.length;i++){
          if(arr1[i] != 0){ 
              int temp=arr1[i]; //temp=1|temp=
              arr1[i]=arr1[j]; //0=0    |
              arr1[j]=temp;//0=1        |
              j++;
          }
      }
      for(int i=0;i<arr1.length;i++){
          System.out.println(arr1[i]+"\t"+i);
      }
    }
}   


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {

                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is Not a Prime Number");
        }
    }
}
*/