class Date {

    // Private variables
    private int year;
    private int month;
    private int day;

    // Constructor
    Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    // Getter methods
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }


    // Setter methods with validation

    public void setYear(int year) {

        if (year >= 1000 && year <= 9999) {
            this.year = year;
        } else {
            System.out.println("Invalid Year");
        }
    }

    public void setMonth(int month) {

        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid Month");
        }
   }

    public void setDay(int day) {

        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Invalid Day");
        }
    }


    // Method to set complete date
    public void setDate(int year, int month, int day) {

        setYear(year);
        setMonth(month);
        setDay(day);
    }

    // toString method
    public String toString() {

        return String.format("%02d/%02d/%04d", month, day, year);
    }
}

