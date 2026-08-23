//Write a Java program to find the union of two arrays.

class UnionOfTwoArray{

	static void Union(int arr1[],int arr2[]){
		int arr3[]=new int[arr1.length + arr2.length];	
		int k=0;
		int temp;
		for(int i=0;i<arr1.length;i++){
			arr3[k]=arr1[i];
			k++;
		}
		for(int i=0;i<arr2.length;i++){
			arr3[k]=arr2[i];
			k++;
		}
		
		
		for(int i=0;i<arr3.length;i++){
			for(int j=0;j<arr3.length-1;j++){
				if(arr3[j]>arr3[j+1]){
					temp=arr3[j];
					arr3[j]=arr3[j+1];
					arr3[j+1]=temp;	
				}
			}
			
		}

		for(int i=0;i<arr3.length-1;i++){
			System.out.print(arr3[i]+"\t");			
		}


		
	}

	public static void main(String ar[]){
		int arr1[]={1,2,3,4,5,6};
		int arr2[]={4,5,6,7,8,9};

		Union(arr1,arr2);
	}

}