import java.util.Scanner;
class StudentInfo{
	String FName;
	String LName;
	String MoNo;
	String Email;
	int RollNo;
	Double CGPA; 
	
	 void getStudentDetails(){
	    System.out.println("FName  : "+FName);
	    System.out.println("LName  : "+LName);
	    System.out.println("MoNO   : "+MoNo);
	    System.out.println("Email  : "+Email);
	    System.out.println("RollNo : "+RollNo);
	    System.out.println("CGPA   : "+CGPA);
	    
		
	}

}

class Student{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		StudentInfo SI=new StudentInfo();
		
		System.out.println("Enter First Name : :");
		SI.FName=sc.nextLine();

		System.out.println("Enter Last Name : :");
		SI.LName=sc.nextLine();

		System.out.println("Enter Mobile Number : :");
		SI.MoNo=sc.nextLine();
		
		System.out.println("Enter Email : :");
		SI.Email=sc.nextLine();

		System.out.println("Enter RollNo : :");
		SI.RollNo=sc.nextInt();

		System.out.println("Enter CGPA : :");
		SI.CGPA=sc.nextDouble();
		
		System.out.println("All Details of Student ");
		SI.getStudentDetails();
			
	}
}
