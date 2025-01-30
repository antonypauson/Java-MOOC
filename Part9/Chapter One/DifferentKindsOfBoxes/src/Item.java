public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object object) {
        Item item = (Item) object;
        return item.getName().equals(this.getName());
    }

    public int hashCode() {
        return 31 * this.name.hashCode();
    }
}