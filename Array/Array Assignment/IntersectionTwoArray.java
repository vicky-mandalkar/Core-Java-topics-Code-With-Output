//Write a Java program to find the intersection of two arrays.
class IntersectionTwoArray{

	static void Insertion(int arr1[],int arr2[]){
		 
		int temp[]=new int[arr1.length];
		int k=0;
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					temp[k]=arr1[i];
					k++;
				}
			
			}
		}
		
		for(int i=0;i<temp.length;i++){
			if(temp[i] != 0){
				System.out.print(temp[i]+"\t");
			}
		
		}
	}

	public static void main(String er[]){
		int arr1[]={1,2,3,4,5,6};
		int arr2[]={4,5,6,7,8,9};
		
		Insertion(arr1,arr2);
	}

}
/*

int arr1[]={1,2,3,4,5,6};
int arr2[]={4,5,6,7,8,9};
OUTPUT----> 4       5       6       
*/