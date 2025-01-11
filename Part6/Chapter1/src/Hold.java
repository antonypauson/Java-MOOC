import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> cases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.cases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        this.cases.add(suitcase);
    }

    public String toString() {
        return this.cases.size() + " suitcases (" + this.getTotalWeight() + " kg)";
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (Suitcase aCase : cases) {
            totalWeight += aCase.getTotalWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for (Suitcase aCase: cases) {
            System.out.println(aCase);
        }
    }

    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);
        hold.printItems();
    }
}
