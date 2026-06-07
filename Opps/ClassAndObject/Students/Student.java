import java.util.Scanner;

class Person {

    String firstName;
    String lastName;
    String mobileNumber;
    String email;

    int rollNo;
    double cgpa;
    String branch;
    String collegeName;

    void getPersonDetails() {

        System.out.println("First Name    : " + firstName);
        System.out.println("Last Name     : " + lastName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Email         : " + email);
    
        System.out.println("Roll Number   : " + rollNo);
        System.out.println("CGPA          : " + cgpa);
        System.out.println("Branch        : " + branch);
        System.out.println("College Name  : " + collegeName);
    }
}

class Student {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Person p = new Person();

        System.out.println("Enter First Name : ");
        p.firstName = sc.nextLine();

        System.out.println("Enter Last Name : ");
        p.lastName = sc.nextLine();

        System.out.println("Enter Mobile Number : ");
        p.mobileNumber = sc.nextLine();

        System.out.println("Enter Email : ");
        p.email = sc.nextLine();

        System.out.println("Enter Roll Number : ");
        p.rollNo = sc.nextInt();

        System.out.println("Enter CGPA : ");
        p.cgpa = sc.nextDouble();

        //p.nextLine();

        System.out.println("Enter Branch : ");
        p.branch = sc.nextLine();

        System.out.println("Enter College Name : ");
        p.collegeName = sc.nextLine();

        System.out.println("\n===== Student Details =====\n");

        p.getPersonDetails();
    }
}
/*
Enter First Name :
vicky
Enter Last Name :
mandalkar
Enter Mobile Number :
8055800958
Enter Email :
vicky@gmail.com
Enter Roll Number :
3132
Enter CGPA :
7.9
Enter Branch :
Enter College Name :
csmss chh shahu

===== Student Details =====

First Name    : vicky
Last Name     : mandalkar
Mobile Number : 8055800958
Email         : vicky@gmail.com
Roll Number   : 3132
CGPA          : 7.9
Branch        :
College Name  : csmss chh shahu
*/