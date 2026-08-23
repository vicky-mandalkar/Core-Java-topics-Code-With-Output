<<<<<<< HEAD
public class App{
	public static void main(String ar[]){
		String Student[]={"PHY","CHEM","MATH","BIO","ENG"};
		int Marks[]={55,66,77,88,99};

		Student s1=new Student(11,"vicky",Student,Marks);
		s1.PrintStudentInfo();
		s1.setName("RAM");
		s1.PrintStudentInfo();

	}
}
/*
--------------Student Details--------------
   ID      NAME   SUBJECT     MARKS
------------------------------------------
   11     vicky
                 PHY :    55
                CHEM :    66
                MATH :    77
                 BIO :    88
                 ENG :    99
=========================================
*/
=======
public class App{
	public static void main(String ar[]){
		String Student[]={"PHY","CHEM","MATH","BIO","ENG"};
		int Marks[]={55,66,77,88,99};

		Student s1=new Student(11,"vicky",Student,Marks);
		s1.PrintStudentInfo();
	}
}
/*
--------------Student Details--------------
   ID      NAME   SUBJECT     MARKS
------------------------------------------
   11     vicky
                 PHY :    55
                CHEM :    66
                MATH :    77
                 BIO :    88
                 ENG :    99
=========================================
*/
>>>>>>> 209d7a204d30a9b82fd17bcc52287fc7f1b2cf9a
