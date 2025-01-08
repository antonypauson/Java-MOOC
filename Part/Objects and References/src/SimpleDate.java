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

    public boolean before(SimpleDate compared) {

        if (this.year < compared.year) {
            return true;
        }

        if (this.year > compared.year) {
            return false;
        }
        return false;
    }


    public static void main(String[] args) {
        SimpleDate date1 = new SimpleDate(1, 1, 780);
        SimpleDate date2 = new SimpleDate(19, 6, 1623);

        System.out.println(date1 + " is earlier than " + date2 + ": " + date1.before(date2));

        Person pascal = new Person("Blaise Pascal", date2);
        Person muhammed = new Person("Muhammed ibn Musa", date1);

        if (muhammed.olderThan(pascal)) {
            System.out.println(muhammed.getName() + " is older than " + pascal.getName());
        } else {
            System.out.println(muhammed.getName() + " is not older than " + pascal.getName());
        }
    }
}
