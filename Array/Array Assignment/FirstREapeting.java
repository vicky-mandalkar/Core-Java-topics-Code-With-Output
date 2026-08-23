//Write a Java program to find the first repeating element in an array.
/*
Array : 4 5 1 2 0 4 1 2
Output: 4
*/
class FirstReapeting{
	static void firstReap(int arr[]){
		int cnt=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					System.out.print("Your FIest Repeating Element : "+arr[i]+"\t");
					return ;
				}
			}	
		}
	}

	public static void main(String ar[]){
		int arr[] = {4, 5, 1, 2, 0, 4, 1, 2};
		firstReap(arr);
	}
}
/*
Your FIest Repeating Element : 4
*/