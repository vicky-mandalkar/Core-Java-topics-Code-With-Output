public class Employee{
	private int id;
	private String fName;
	private String lName;
	private int salary;
	
	Employee(int id,String fName ,String lName ,int salary){
		this.id=id;
		this.fName=fName;
		this.lName=lName;
		this.salary=salary;
	}

	public int getID(){
		return id;
	}
	public String getFNAME(){
		return fName;
	}
	public String getLNAME(){
		return lName;
	}
	public int getSALARY(){
		return salary;
	}
	public String getName(){ // get full name
		return fName+" "+lName;
	}
	public int getAnnSalary(){ // get Annual Salary
		return salary*12;
	}

	

	void setSalary(int salary){
		this.salary=salary;
	}
	
	public String toString(){
		return String.format("Employee [id = %d , name = %s , LastName = %s , salary = %d ]",id,fName,lName,salary);
	}

}