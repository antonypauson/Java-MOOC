import java.util.ArrayList;

public class Box implements Packable {

    private int maxCapacity;
    private ArrayList<Packable> packables;

    public Box(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.packables = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (this.maxCapacity - packable.weight() > 0) {
            packables.add(packable);
            this.maxCapacity -= packable.weight();
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable packable : packables) {
            weight += packable.weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + this.packables.size() + " items, total weight " + this.weight() + " kg";
    }
    public static void main(String[] args) {
        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
    }
}
