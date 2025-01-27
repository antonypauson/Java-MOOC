public class SimpleDate {
    private int day, month, year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof SimpleDate)) {
            return false;
        }

        SimpleDate dateObject = (SimpleDate) object;

        return (dateObject.day == this.day &&
                dateObject.month == this.month &&
                dateObject.year == this.year);
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + day;
        result = 31 * result + month;
        result = 31 * result + year;
        return result;
    }

    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }
}
