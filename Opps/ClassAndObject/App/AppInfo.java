class Box{
	int len;
	double width;
	float ht;

	double getVolumeOfBox(){
		return len*width*ht;
	}
}

class AppInfo{
	public static void main(String args[]){
		Box b1=new Box();
		System.out.println("Length : "+b1.len);
		System.out.println("Width : "+b1.width);
		System.out.println("HEight : "+b1.ht);
		
		double res1=b1.getVolumeOfBox();
		System.out.println("Before Initilize value : "+res1);
		b1.len=5;
		b1.width=12.3;
		b1.ht=1.2f;
		System.out.println("----------------------------------");
		System.out.println("Length : "+b1.len);
		System.out.println("Width : "+b1.width);
		System.out.println("HEight : "+b1.ht);

		double res2=b1.getVolumeOfBox();
		System.out.println("Before Initilize value : "+res2);
	}
}