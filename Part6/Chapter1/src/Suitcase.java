import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int totalWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();

    }

    public void addItem(Item item) {
        this.totalWeight = 0;
        for (Item itemOne : items) {
            totalWeight += itemOne.getWeight();
        }

        if (totalWeight + item.getWeight() < maxWeight) {
            items.add(item);
            totalWeight += item.getWeight();
        }
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (items.size() == 1) {
            return items.size() + " item (" + totalWeight + " kg)";
        }
        return items.size() + " items (" + totalWeight + " kg)";
    }

    public void printItems() {
        String output = "The suitcase contains the following items\n";

        for (Item item : items) {
            output += item.toString() + "\n";
        }
        System.out.println(output);
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);
        suitcase.addItem(book);
        System.out.println(suitcase);
        suitcase.addItem(phone);
        System.out.println(suitcase);
        suitcase.addItem(brick);
        System.out.println(suitcase);

        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.getTotalWeight() + " kg");
    }
}
