public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person (String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public void printPerson() {
        System.out.println(this.name + " is " + this.age + " years old");
    }

    public void growOlder() {
        this.age++;
    }

    public boolean isAdult() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }

    public double bodyMassIndex() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }

    public String toString() {
        return this.name + " is " + this.age + " years old, their BMI is " + this.bodyMassIndex();
    }

    public static void main(String[] args) {
        Person tony = new Person("Tony");
        tony.printPerson();

        while (tony.age < 30) {
            tony.growOlder();
        }

        tony.printPerson();

        System.out.println(tony.isAdult());

        System.out.println(tony);
    }
}
