public  class Employee{
	private int id;
	private String firstName;
	private String lastName;
	private double salary;

	public Employee(int id,String firstName,String lastName,double salary){
		this.id=id; this.firstName=firstName; this.lastName=lastName; this.salary=salary;
	}

	public void setFirstName(String firstName){this.firstName=firstName;}
	public void setLastName(String lastName) { this.lastName=lastName;}
	public  void setSalary(double salary) { this.salary=salary;}

	public int getId(){return  id;}
	public String getFirstName() { return  firstName;}
	public String getLastName(){ return lastName;}
	public double getSalary(){ return salary;}

	public double getAnnualsalary(){ return 12*salary;}
	public  double raiseSalary(int percent){
			if(percent<0){
				System.out.println("percent Value Must be Positive");
				System.exit(-1);
			}

		this.salary=this.salary+this.salary*(percent/100);
		return this.salary;
	}

}