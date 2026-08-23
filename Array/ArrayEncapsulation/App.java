<<<<<<< HEAD
/*
Reference Type Array

.
├───bin
│       App.class
│       Employee.class
│
└───src
        App.java
        Employee.java
*/


public  class App{

	public static  void printAllEmployees(Employee empList[]){
		System.out.println("__________________________________________");
		System.out.println(" ID      NAME         LASTNAME   SALARY");
		System.out.println("__________________________________________");
		for (int i=0;i<empList.length ;i++ ) {
				Employee employee=empList[i];

				System.out.printf("%4d  ",employee.getId());
				System.out.printf("%10s   ",employee.getFirstName());
				System.out.printf("%10s   ",employee.getLastName());
				System.out.printf("%.2f   ",employee.getSalary());
				System.out.println();	

		}

	}

	public static void main(String[] args) {

		Employee employee1=new Employee(101,"Rahul","Patil",55000);
		Employee employee2=new Employee(102,"Kareena","Kapoor",56000);
		Employee employee3=new Employee(103,"Katrina","Kaif",75000);
		Employee employee4=new Employee(104,"Raveena","Tandon",45000);
		Employee employee5=new Employee(105,"Sakeena","Khan",35000);


		Employee empList[]=new Employee[5];
		empList[0]=employee1;
		empList[1]=employee2;
		empList[2]=employee3;
		empList[3]=employee4;
		empList[4]=employee5;

		printAllEmployees(empList);
	}
}
/*
__________________________________________
 ID      NAME         LASTNAME   SALARY
__________________________________________
 101       Rahul        Patil   55000.00
 102     Kareena       Kapoor   56000.00
 103     Katrina         Kaif   75000.00
 104     Raveena       Tandon   45000.00
 105     Sakeena         Khan   35000.00
*/
=======
/*
Reference Type Array

.
├───bin
│       App.class
│       Employee.class
│
└───src
        App.java
        Employee.java
*/


public  class App{

	public static  void printAllEmployees(Employee empList[]){
		System.out.println("__________________________________________");
		System.out.println(" ID      NAME         LASTNAME   SALARY");
		System.out.println("__________________________________________");
		for (int i=0;i<empList.length ;i++ ) {
				Employee employee=empList[i];

				System.out.printf("%4d  ",employee.getId());
				System.out.printf("%10s   ",employee.getFirstName());
				System.out.printf("%10s   ",employee.getLastName());
				System.out.printf("%.2f   ",employee.getSalary());
				System.out.println();	

		}

	}

	public static void main(String[] args) {

		Employee employee1=new Employee(101,"Rahul","Patil",55000);
		Employee employee2=new Employee(102,"Kareena","Kapoor",56000);
		Employee employee3=new Employee(103,"Katrina","Kaif",75000);
		Employee employee4=new Employee(104,"Raveena","Tandon",45000);
		Employee employee5=new Employee(105,"Sakeena","Khan",35000);


		Employee empList[]=new Employee[5];
		empList[0]=employee1;
		empList[1]=employee2;
		empList[2]=employee3;
		empList[3]=employee4;
		empList[4]=employee5;

		printAllEmployees(empList);
	}
}
/*
__________________________________________
 ID      NAME         LASTNAME   SALARY
__________________________________________
 101       Rahul        Patil   55000.00
 102     Kareena       Kapoor   56000.00
 103     Katrina         Kaif   75000.00
 104     Raveena       Tandon   45000.00
 105     Sakeena         Khan   35000.00
*/
>>>>>>> 209d7a204d30a9b82fd17bcc52287fc7f1b2cf9a
