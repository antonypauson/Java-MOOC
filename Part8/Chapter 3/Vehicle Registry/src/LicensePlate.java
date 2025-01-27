public class LicensePlate {
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(Object comparedObj) {
        if (this == comparedObj) {
            return true;
        }

        if (!(comparedObj instanceof LicensePlate)) {
            return false;
        }

        LicensePlate plateObj = (LicensePlate) comparedObj;

        return plateObj.country.equals(this.country) && plateObj.liNumber.equals(this.liNumber);
    }

    public int hashCode() {
        return 31 * country.hashCode() + liNumber.hashCode();
    }
}
