//Write a  JAVA program to delete all duplicate elements from an array.
class DeleteDuplicate{

	static int max(int arr[]){
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		return max;
	}

	static void DelDuplicate(int arr[]){
		int count=0;
		int temp[]=new int[max(arr)+1];

		for(int i=0;i<arr.length;i++){
			temp[arr[i]]++;
		}

		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

		System.out.println();


		for(int i=0;i<temp.length;i++){
			if(temp[i]!=0){
				count++;		
			}	
		}

		int temp1[] = new int[count];
		int j=0;

		for(int i=0;i<temp.length;i++){
			if(temp[i] !=0){
			temp1[j++] = i;
			} 
		}
		
		for(int i=0;i<temp1.length;i++){
			System.out.print(temp1[i]+" ");
		}
	
		

		
		
	}

	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3, 3};	//1,2,3,4,7,8
		DelDuplicate(arr);
 		
		
	}
}