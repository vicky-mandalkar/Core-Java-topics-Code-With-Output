/*
//1. Second Largest Element
class secLarge{
	public static void  main (String ar[]){
		int arr[]={1,2,3,1,2,3,42,45,32,3,5};
		int large=arr[0];
		int secLarge=large;
		for(int i=0;i<arr.length;i++){
			if(large<arr[i]){
				secLarge=large;
				large=arr[i];
			}
		}
		System.out.println("large : "+large);
		System.out.println("Second large : "+secLarge);

	}
}
*/
//2. Move All Zeros to End
class secLarge{
	public static void  main (String ar[]){
		int arr[]={1,0,2,0,4,0,5};
		int cnt=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] != 0){
				int arr[cnt]=arr[i];
			}
		}
			
	}
}
