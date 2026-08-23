/*
class java.lang.Object{
	public String toString(){
		return this.getClass()+"@"+hashcode();
	}
}
*/
class Point {
	private int x;
	private int y;

	Point (int x,int y){
		this.x=x;
		this.y=y;
	}

	//setter
	//getter

	//@Override;
	public String toString(){
		return "X:"+x+" Y:"+y;
	}

}

class Test{
	public static void main(String ar[]){
		Point p1=new Point(11,22);
		//System.out.println(p1.x);
		//System.out.println(p1.getX());

		System.out.println(p1);//Point@2a139a55
		//Point@2a139a55
		//className @ hashcode

		//why ? object --> string internally toString()
		//we are pointing p1 internally java call toString () method

		//System.out.println(p1); same System.out.println(p1.toString());	
	}
}
//output : X:11 Y:22