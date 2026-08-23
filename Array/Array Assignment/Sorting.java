//Write a  JAVA program to sort array elements in ascending or descending order.

class Sorting{
	
	public static void Asending(int arr[]){
		System.out.println("Asending Order : ");
		int temp;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}			
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");			
		}


	}

	public static void Decending(int arr[]){
		System.out.println("\nDecending Order : ");
		int temp;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");			
		}
	}

	public static void main(String ar[]){
		int arr[]={2,1,3,1,4,5,3,8,5,3};
		
		Asending(arr);
		
		Decending(arr);
	}
}
/*
Asending Order :
1       1       2       3       3       3       4       5       5       8
Decending Order :
8       5       5       4       3       3       3       2       1       1
*/