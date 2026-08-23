//  Write a  JAVA program to print all unique elements in the array.
class UniqueElement{
	
	static int max(int arr[]){
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		return max;
	}

	static void Unique(int arr[]){
		int temp[]=new int[max(arr)+1];
		for(int i=0;i<arr.length;i++){
			temp[arr[i]] ++;
		}
		
		for(int i=0;i<temp.length;i++){
			if(temp[i] != 0){
				System.out.println(i);
			}
		}
		//System.out.println(temp.length);

	}

	public static void main(String er[]){
		int arr[]={1,2,33,2,44,5,4,33,5,6};
		Unique(arr);

	}

}
/*
1
2
4
5
6
33
44
*/