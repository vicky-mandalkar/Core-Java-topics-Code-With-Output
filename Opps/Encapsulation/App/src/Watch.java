public class Watch{

	// member fields | instance field
	private int hr;
	private int min; 
	private int sec;

	// Constructor of Watch .
	public Watch(){
		hr=min=sec=10;

	}
	public Watch(int hr , int min,int sec){
		this.hr=hr;
		this.min=min;
		this.sec=sec;

	}
	public Watch(int hr, int min){
		this.hr=hr;
		this.min=min;
	}

	//Getter method 
	public int getHr(){
		return this.hr;
	}
	public int getMin(){
		return this.min;
	}
	public int getSec(){
		return this.sec;
	}

	//Setter Method 
	public void setHr(int hr){
		this.hr=hr;
	}
	public void setMin(int min){
		this.min=min;
	}
	public void setSec(int sec){
		this.sec=sec;
	}

	//Display All 
	public void displayClock(){
		System.out.println("Hr  : "+this.hr);
		System.out.println("Min : "+this.min);
		System.out.println("Sec : "+this.sec);
	}







}
