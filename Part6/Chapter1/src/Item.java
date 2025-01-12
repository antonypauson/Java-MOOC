public class Item {
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return name + " (" + weight + " kg)";
    }

    public static void main(String[] args) {
        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        System.out.println(book);
        System.out.println(phone);
    }
}
