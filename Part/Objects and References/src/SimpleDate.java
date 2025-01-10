public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    //if the date is before the previous date
    public boolean before(SimpleDate compared) {

        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year &&
        this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year
        && this.month == compared.month
        && this.day < compared.day) {
            return true;
        }
        return false;
    }

    public void advance() {
        if (this.day == 30 && this.month == 12) {
            day = 1;
            month = 1;
            year++;
        } else  if (this.day == 30) {
            day = 1;
            month++;
        } else {
            day++;
        }
    }


    //are two objects equal?
    public boolean equals(Object compared) {

        if (this == compared) {
            return true;
        }

        if (!(compared instanceof SimpleDate)) {
            return false;
        }

        SimpleDate comparedInstance = (SimpleDate) compared;

        if (this.day == comparedInstance.day &&
            this.month == comparedInstance.month &&
            this.year == comparedInstance.year) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        SimpleDate date1 = new SimpleDate(30, 12, 780);
        SimpleDate date2 = new SimpleDate(19, 6, 1623);

//        System.out.println(date1 + " is earlier than " + date2 + ": " + date1.before(date2));

        Person pascal = new Person("Blaise Pascal", date2);
        Person muhammed = new Person("Muhammed ibn Musa", date1);

//        if (muhammed.olderThan(pascal)) {
//            System.out.println(muhammed.getName() + " is older than " + pascal.getName());
//        } else {
//            System.out.println(muhammed.getName() + " is not older than " + pascal.getName());
//        }

        //lets compare dates
//        SimpleDate date3 = new SimpleDate(1, 1, 780);
//        System.out.println(date1.equals(date3));
        System.out.println(date1);
        date1.advance();
        System.out.println(date1);

    }
}
