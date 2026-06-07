class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Vicky");

        	p1.printPerson();

        	p1.growOlder();

        	System.out.println();

        	System.out.println("After growing older:");

        	p1.printPerson();

        	System.out.println();

        	System.out.println("Returned Age : " + p1.returnAge());

        	System.out.println("Is Legal Age : " + p1.isOfLegalAge());
    }
}
/*
Name : Vicky
Age : 0

After growing older:
Name : Vicky
Age : 1

Returned Age : 1
Is Legal Age : false
*/