public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return name + "\n " + " " + address;
    }

    public static void main(String[] args) {
        Person ada = new Person("Adva Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");

        System.out.println(ada);
        System.out.println(esko);
    }
}
