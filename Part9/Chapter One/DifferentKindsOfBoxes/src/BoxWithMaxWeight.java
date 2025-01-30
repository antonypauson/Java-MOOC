import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Item item) {
        if (item.getWeight() <= capacity) {
            items.add(item);
            capacity -= item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
