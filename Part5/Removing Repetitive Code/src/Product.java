//constructor overloading

public class Product {
    private String name;
    private String location;
    private int weight;

    public Product (String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }
    public Product(String name) {
        this(name, "shelf", 1);
    }

    public Product(String name, String location) {
        this(name, location, 1);
    }

    public Product(String name, int weight) {
        this(name, "shelf", 1);
    }

    public String toString() {
        return this.name + " (" + weight + " kg) can be found from the " + location;
    }

    public static void main(String[] args) {
        Product tapeMeasure = new Product("tape Measure");
        System.out.println(tapeMeasure);

        Product plaster = new Product("Plaster", "home improvement section");
        System.out.println(plaster);

        Product tyre = new Product("Tyre", 5);
        System.out.println(tyre);
    }
}
