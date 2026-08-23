public class Salary{
	public static void main(String ar[]){
		Employee e1=new Employee(12,"vicku","mandalkar",1200);
		System.out.println("All DETSILS");
		System.out.println("ID 			: "+e1.getID());
		System.out.println("First Name		: "+e1.getFNAME());
		System.out.println("Last Name	 	: "+e1.getLNAME());
		System.out.println("Salary		: "+e1.getSALARY());
		System.out.println("Annual Sallry	: "+e1.getAnnSalary());

		System.out.println("Alll info		: "+e1);
		e1.setSalary(20000);
		System.out.println("After Update Salary : "+e1.getSALARY());				
	}

}
/*
All DETSILS
ID                      : 12
First Name              : vicku
Last Name               : mandalkar
Salary        		: 1200
Annual Sallry   	: 14400
Alll info               : Employee [id = 12 , name = vicku , LastName = mandalkar , salary = 1200 ]
After Update Salary 	: 20000
*/