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
