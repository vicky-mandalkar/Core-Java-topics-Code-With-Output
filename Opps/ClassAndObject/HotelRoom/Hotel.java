import java.util.Scanner;

class Room {

    int roomNumber;
    String roomType;
    double roomPrice;
    String roomFacility;
    int floorNumber;
    boolean acAvailable;

    void getRoomDetails() {

        System.out.println("Room Number   : " + roomNumber);
        System.out.println("Room Type     : " + roomType);
        System.out.println("Room Price    : " + roomPrice);
        System.out.println("Room Facility : " + roomFacility);
        System.out.println("Floor Number  : " + floorNumber);
        System.out.println("AC Available  : " + acAvailable);
    }
}

class Hotel {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Room r = new Room();

        System.out.println("Enter Room Number : ");
        r.roomNumber = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Room Type : ");
        r.roomType = sc.nextLine();

        System.out.println("Enter Room Price : ");
        r.roomPrice = sc.nextDouble();

        
        System.out.println("Enter Room Facility : ");
        r.roomFacility = sc.nextLine();

        System.out.println("Enter Floor Number : ");
        r.floorNumber = sc.nextInt();

        System.out.println("AC Available (true/false) : ");
        r.acAvailable = sc.nextBoolean();

        System.out.println("\n===== Room Details =====\n");

        r.getRoomDetails();
    }
}
/*
Enter Room Number :
101
Enter Room Type :
delux
Enter Room Price :
2500
Enter Room Facility :
tv,wifi and Ac
Enter Floor Number :
3
AC Available (true/false) :
true

===== Room Details =====

Room Number   : 101
Room Type     : delux
Room Price    : 2500.0
Room Facility : tv,wifi and Ac
Floor Number  : 3
AC Available  : true
*/