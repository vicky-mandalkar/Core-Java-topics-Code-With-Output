class Person {

    private String name;
    private int age;

    // Constructor
    Person(String initialName) {

        name = initialName;
        age = 0;
    }

    // Print details
    void printPerson() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    // Increase age
    void growOlder() {

        age++;
    }

    // Return age
    int returnAge() {

        return age;
    }

    // Check legal age
    boolean isOfLegalAge() {

        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}