class BubbleSort{

	public static void main(String ar[]){

		int a[]={36,19,29,12,5};
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;

				}
			}

		}
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
	}

}
/*
5       12      19      29      36
*/

/*
class BubbleSort{

	public static void main(String ar[]){
		int a[]={12,2,1,23,45,23,2};
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}

	}

		
}

*/

