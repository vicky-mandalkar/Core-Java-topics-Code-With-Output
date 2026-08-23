class deleteElement{
	public static void main(String ar[]){

		int arr[]={10,20,30,40,50};
		int temp[]=new int[arr.length+1];

		int idx=1;
		int ele=200;
		int j=0;
		int del=20;

 		for(int i=0;i<idx;i++){
			temp[j++]=arr[i];			
		}
		for(int i=idx;i<arr.length;i++){
			if(i==idx){
				temp[j++]=ele;
			}	
			temp[j++]=arr[i];	
		}
		

		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+"\t");		
		}

	}

}