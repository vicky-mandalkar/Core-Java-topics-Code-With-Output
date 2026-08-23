//Write a  JAVA program to find the second largest element in an array.
class SecondLargest{

	static void Seclarge(int arr[]){
		int large=arr[0];
		int seclarge=arr[0];
		for(int i=0;i<arr.length;i++){
			if(large<arr[i]){
				large=arr[i];
			}
		}
		System.out.println("largest Element : "+large);

		for(int i=0;i<arr.length;i++){
			if(seclarge<arr[i] && arr[i]!= large){
				seclarge=arr[i];
			}
		}
		System.out.println("Second largest Element : "+seclarge);
	}


	public static void main(String ar[]){
		int arr[]={1,2,3,4,5,6};
		Seclarge(arr);
	}
}
/*
largest Element : 6
Second largest Element : 5
*/