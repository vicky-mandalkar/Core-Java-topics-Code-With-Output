public class CompeateDate{
	public static void main(String[] args) {

       	 	// Creating object
        	Date d1 = new Date(2025, 5, 3);

        	// Display date
        	System.out.println("Date: " + d1);

        	// Change values
        	d1.setDay(15);
        	d1.setMonth(8);
        	d1.setYear(2026);

        	System.out.println("Updated Date: " + d1);

        	// Invalid values
        	d1.setMonth(15);
        	d1.setDay(40);
    }

}
/*
Date: 05/03/2025
Updated Date: 08/15/2026
Invalid Month
Invalid Day
*/