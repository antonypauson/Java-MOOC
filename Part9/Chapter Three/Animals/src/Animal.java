public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("(" + name + ") eats" );
    }

     public void sleep() {
         System.out.println("(" + name + ") sleeps");
     }

     public String getName() {
        return name;
     }

    public static void main(String[] args) {
        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();
    }

}
