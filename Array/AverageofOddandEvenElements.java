<<<<<<< HEAD
/*
Array Case 5: Average of Odd and Even Elements
 
From a given array, separately calculate:
- Average of odd elements
- Average of even elements
 
Example Input:
Array = [5, 10, 15, 20, 25]
 
Expected Output:
Odd elements = 5, 15, 25 â†’ Average = 15.0
Even elements = 10, 20 â†’ Average = 15.0
*/




import java.util.Scanner;
class AverageofOddandEvenElements{


//enter  input element in array 
	 
	static void inputArray(int arr[],Scanner sc){
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter "+ i +" Array Element  : ");
			arr[i]=sc.nextInt();
		}
	} 


//array element are showing 
	
	static void print(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println("Index  "+ i +" Element is : "+ arr[i]);
		}
	}

// Average of Odd and Even Elements
	static int Evensum=0;
	static int Oddsum=0;
	static int EvenCnt=0;
	static int OddCnt=0;

	static void sumOdd(int arr[]) {

    		System.out.print("Odd Elements : ");
    		for(int i=0; i<arr.length; i++) {
        		if(arr[i] % 2 != 0) {
           	 		System.out.print(arr[i] + " ");
            			Oddsum = Oddsum + arr[i];
            			OddCnt++;
        		}
    		}

    		System.out.println();

    		System.out.print("Even Elements : ");
    		for(int i=0; i<arr.length; i++) {
        		if(arr[i] % 2 == 0) {
            			System.out.print(arr[i] + " ");
            			Evensum = Evensum + arr[i];
            			EvenCnt++;
        		}
    		}

    		System.out.println();

    		System.out.println("Sum Of Odd Elements : " + Oddsum);
    		System.out.println("Count Of Odd Elements : " + OddCnt);

    		if(OddCnt != 0)
       			 System.out.println("Average Of Odd Elements : " + (double)Oddsum / OddCnt);

    		System.out.println("Sum Of Even Elements : " + Evensum);
   		System.out.println("Count Of Even Elements : " + EvenCnt);

    		if(EvenCnt != 0)
        		System.out.println("Average Of Even Elements : " + (double)Evensum / EvenCnt);
	}


	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("===========INPUT ELEMENT =================");
		inputArray(arr,sc);
		System.out.println("============= Print Element ===============");
		print(arr);
		System.out.println("============= Sum Of Odd Element ===============");
		System.out.print(" Odd Element : ");
		sumOdd(arr);

			
	}
}

/*
Enter Array Size :
10
===========INPUT ELEMENT =================
Enter 0 Array Element  :
11
Enter 1 Array Element  :
12
Enter 2 Array Element  :
13
Enter 3 Array Element  :
14
Enter 4 Array Element  :
15
Enter 5 Array Element  :
16
Enter 6 Array Element  :
17
Enter 7 Array Element  :
18
Enter 8 Array Element  :
19
Enter 9 Array Element  :
20
============= Print Element ===============
Index  0 Element is : 11
Index  1 Element is : 12
Index  2 Element is : 13
Index  3 Element is : 14
Index  4 Element is : 15
Index  5 Element is : 16
Index  6 Element is : 17
Index  7 Element is : 18
Index  8 Element is : 19
Index  9 Element is : 20
============= Sum Of Odd Element ===============
 Odd Element : Odd Elements : 11 13 15 17 19
Even Elements : 12 14 16 18 20
Sum Of Odd Elements : 75
Count Of Odd Elements : 5
Average Of Odd Elements : 15.0
Sum Of Even Elements : 80
Count Of Even Elements : 5
Average Of Even Elements : 16.0
*/
=======
/*
Array Case 5: Average of Odd and Even Elements
 
From a given array, separately calculate:
- Average of odd elements
- Average of even elements
 
Example Input:
Array = [5, 10, 15, 20, 25]
 
Expected Output:
Odd elements = 5, 15, 25 â†’ Average = 15.0
Even elements = 10, 20 â†’ Average = 15.0
*/




import java.util.Scanner;
class AverageofOddandEvenElements{

//enter  input element in array 
	 
	static void inputArray(int arr[],Scanner sc){
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter "+ i +" Array Element  : ");
			arr[i]=sc.nextInt();
		}
	} 


//array element are showing 
	
	static void print(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println("Index  "+ i +" Element is : "+ arr[i]);
		}
	}

// Average of Odd and Even Elements
	static int Evensum=0;
	static int Oddsum=0;
	static int EvenCnt=0;
	static int OddCnt=0;

	static void sumOdd(int arr[]) {

    		System.out.print("Odd Elements : ");
    		for(int i=0; i<arr.length; i++) {
        		if(arr[i] % 2 != 0) {
           	 		System.out.print(arr[i] + " ");
            			Oddsum = Oddsum + arr[i];
            			OddCnt++;
        		}
    		}

    		System.out.println();

    		System.out.print("Even Elements : ");
    		for(int i=0; i<arr.length; i++) {
        		if(arr[i] % 2 == 0) {
            			System.out.print(arr[i] + " ");
            			Evensum = Evensum + arr[i];
            			EvenCnt++;
        		}
    		}

    		System.out.println();

    		System.out.println("Sum Of Odd Elements : " + Oddsum);
    		System.out.println("Count Of Odd Elements : " + OddCnt);

    		if(OddCnt != 0)
       			 System.out.println("Average Of Odd Elements : " + (double)Oddsum / OddCnt);

    		System.out.println("Sum Of Even Elements : " + Evensum);
   		System.out.println("Count Of Even Elements : " + EvenCnt);

    		if(EvenCnt != 0)
        		System.out.println("Average Of Even Elements : " + (double)Evensum / EvenCnt);
	}


	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("===========INPUT ELEMENT =================");
		inputArray(arr,sc);
		System.out.println("============= Print Element ===============");
		print(arr);
		System.out.println("============= Sum Of Odd Element ===============");
		System.out.print(" Odd Element : ");
		sumOdd(arr);

			
	}
}

/*
Enter Array Size :
10
===========INPUT ELEMENT =================
Enter 0 Array Element  :
11
Enter 1 Array Element  :
12
Enter 2 Array Element  :
13
Enter 3 Array Element  :
14
Enter 4 Array Element  :
15
Enter 5 Array Element  :
16
Enter 6 Array Element  :
17
Enter 7 Array Element  :
18
Enter 8 Array Element  :
19
Enter 9 Array Element  :
20
============= Print Element ===============
Index  0 Element is : 11
Index  1 Element is : 12
Index  2 Element is : 13
Index  3 Element is : 14
Index  4 Element is : 15
Index  5 Element is : 16
Index  6 Element is : 17
Index  7 Element is : 18
Index  8 Element is : 19
Index  9 Element is : 20
============= Sum Of Odd Element ===============
 Odd Element : Odd Elements : 11 13 15 17 19
Even Elements : 12 14 16 18 20
Sum Of Odd Elements : 75
Count Of Odd Elements : 5
Average Of Odd Elements : 15.0
Sum Of Even Elements : 80
Count Of Even Elements : 5
Average Of Even Elements : 16.0
*/
>>>>>>> 209d7a204d30a9b82fd17bcc52287fc7f1b2cf9a
