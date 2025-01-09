public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    private Pet pet;
    private SimpleDate birthday;

    public Person(String name) {
        this(name, 0, 0, 0);
    }

    public Person(String name, SimpleDate date) {
         this.name = name;
         this.birthday = date;

    }
    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // other constructors and methods

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    public boolean olderThan(Person compared) {

        int ownYear = this.birthday.getYear();
        int otherYear = compared.birthday.getYear();

        if (ownYear < otherYear) {
            return true;
        }

        if (ownYear > otherYear) {
            return false;
        }
        return false;
    }

//    @Override
//    public String toString() {
//        return this.name + ", has a friend called " + pet.getName() + " (" + pet.getBreed() + ")";
//    }


    @Override
    public String toString() {
        return this.name + ", born on " + this.birthday;
    }

    //comparison
    public boolean equals(Object compared) {

        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;

        if (this.name.equals(comparedPerson.name)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Person tony = new Person("TONY");
        Person tonyJr = new Person("TONY");

        System.out.println(tony.equals(tonyJr));
    }
}