
import java.util.ArrayList;
import java.util.Iterator;
public class Example9{

	public static void DisplayEmployee(ArrayList<Employee> empList){
	
		Iterator<Employee> itr=empList.iterator();
		System.out.println("Id	AGE	NAME	Salary");
		System.out.println("----------------------------------");
		while(itr.hasNext()){
			Employee emp=itr.next();
        	  	System.out.printf("%4d",emp.getId());
        	  	System.out.printf("%4d",emp.getAge());
        	  	System.out.printf("%10s",emp.getName());
        	  	System.out.printf("%13.3f",emp.getSalary());
        	  	System.out.println();
		}

	}

    	public static void containsEmployee(ArrayList<Employee> empList, Employee emp) {

        	System.out.println("Employee Found : " + empList.contains(emp));
    	}

	public static double totalSalary(ArrayList<Employee> empList) {
        	double sum = 0;
        	Iterator<Employee> itr = empList.iterator();
        	while (itr.hasNext()) {
            		Employee emp = itr.next();
            		sum += emp.getSalary();
        	}
        	return sum;
    	}

	public static void main(String ar[]){
		
        	ArrayList<Employee> empList = new ArrayList<>(); // 10

        	Employee emp1 = new Employee(101, "Alice", 50000, 25);
        	Employee emp2 = new Employee(102, "Bob", 60000, 30);
        	Employee emp3 = new Employee(103, "Charlie", 55000, 28);
        	Employee emp4 = new Employee(104, "David", 70000, 35);
        	Employee emp5 = new Employee(105, "Eva", 65000, 32);

        	empList.add(emp1);
        	empList.add(emp2);
        	empList.add(emp3);
        	empList.add(emp4);
        	empList.add(emp5);
		
		DisplayEmployee(empList);


		Employee emp6 = new Employee(102, "Bob", 60000, 30);
        	containsEmployee(empList, emp6);

		//totalSalary(empList);
		System.out.println("Sum is  : "+totalSalary(empList));
		
	}
}