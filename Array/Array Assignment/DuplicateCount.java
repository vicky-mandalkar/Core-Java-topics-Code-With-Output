//Write a  JAVA program to count the total number of duplicate elements in an array.

class DuplicateCount{
	static int max(int arr[]){
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];			
			}

		}
		return max;
	}

	static void CountDuplicate(int arr[]){
		int cnt=0;
		int temp[]=new int[max(arr)+1];
		
		for(int i=0;i<arr.length;i++){
			temp[arr[i]]++;
		}

		for(int i=0;i<temp.length;i++){
			if(temp[i]>1){
				System.out.print(i+" ");

				//cnt++;
			}
		}
		
		//System.out.print(cnt);


	}

	public static void main(String er[]){
		int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3, 3};
		CountDuplicate(arr);
	}
}
/*
2 3 8
*/