import java.util.ArrayList;

public class OneItemBox extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public OneItemBox() {
        items = new ArrayList<>();
        capacity = 0;
    }

    @Override
    public void add(Item item) {
        if (capacity == 0) {
            items.add(item);
            capacity++;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }

}
