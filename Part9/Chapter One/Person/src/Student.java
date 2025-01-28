public class Student extends Person {
    private int credit;

    public Student(String name, String address) {
        super(name, address);
        this.credit = 0;
    }

    public String credits() {
        return "Study credits " + credit;
    }

    public void study() {
        this.credit++;
    }

    public static void main(String[] args) {
        Student ollie = new Student("Ollie", "Ollie's Address");
        System.out.println(ollie);
        System.out.println(ollie.credits());
        ollie.study();
        System.out.println(ollie.credits());
    }

}
