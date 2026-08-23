//Write a  JAVA program to count the frequency of each element in an array.
class CountFreq{
	
	static int max(int arr[]){
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void Freq(int arr[]){
		int temp[]=new int[max(arr)+1]; 
		for(int i=0;i<arr.length;i++){
			temp[arr[i]]=temp[arr[i]]+1;
		}
		
		for(int j=0;j<temp.length;j++){
			if(temp[j] != 0){
				System.out.println(j+":"+temp[j]);

			}
		}

	}
	
	public static void main(String a[]){
		int arr[]={1,2,3,4,2,4,4,2,4,7,8,5};
		Freq(arr);
		//System.out.println(max(arr));
	}

}
/*
int arr[]={1,2,3,4,2,4,4,2,4,7,8,5};

1 : 1
3 : 2
1 : 3
4 : 4
*/