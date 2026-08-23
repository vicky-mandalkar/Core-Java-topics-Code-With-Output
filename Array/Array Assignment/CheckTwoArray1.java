class CheckTwoArray1{

	static String Check(int arr1[],int arr2[]){
		if(arr1.length!=arr2.length){
			return "Both array are not equal";
		}

		for(int i=0;i<arr1.length;i++){
			if(arr1[i] != arr2[i])
				return "Both are differ";
		}
		return "Both are equal";


	}

	public static void main(String arr[]){
		int arr1[]={1,2,3,4,5,6};
		int arr2[]={1,2,3,4,5,6};

		System.out.println(Check(arr1,arr2));
	
	}

}