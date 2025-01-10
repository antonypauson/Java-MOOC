public class Pet {
    private String breed;
    private String name;

    private Person person;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public String getName() {
        return this.name;
    }


    public static void main(String[] args) {
        Pet lucy = new Pet("Lucy", "golden retriever");
        Person leo = new Person("Leo", lucy);

        System.out.println(leo);
    }
}
