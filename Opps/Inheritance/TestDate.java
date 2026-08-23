class MyDate {

    private int year;
    private int month;
    private int day;

    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getters
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // Setters
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // Display Date
    public void displayDate() {
        System.out.println("Date : " + day + "/" + month + "/" + year);
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
class EventDate extends MyDate {

    private String eventName;
    private String location;

    EventDate(int year, int month, int day,
              String eventName, String location) {

        super(year, month, day);

        this.eventName = eventName;
        this.location = location;
    }

    public void displayEvent() {

        displayDate();

        System.out.println("Event Name : " + eventName);
        System.out.println("Location   : " + location);
    }
}
class TestDate {

    public static void main(String[] args) {

        EventDate e1 = new EventDate(
                2026,
                8,
                15,
                "College Fest",
                "Nagpur");

        e1.displayEvent();

        System.out.println();

        EventDate e2 = new EventDate(
                2026,
                12,
                25,
                "Christmas Celebration",
                "Mumbai");

        e2.displayEvent();
    }
}