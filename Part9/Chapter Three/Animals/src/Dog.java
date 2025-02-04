public class Dog extends Animal implements NoiseCapable{

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    public void bark() {
        System.out.println(super.getName() + " barks");
    }


    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.eat();
        fido.bark();

    }

    @Override
    public void makeNoise() {
        this.bark();
    }
}
