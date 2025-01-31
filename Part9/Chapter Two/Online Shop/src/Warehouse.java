import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private Map<String, Integer> product;

    public Warehouse() {
        this.product = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.product.put(product, price);
    }

    public int price(String product) {
        return this.product.getOrDefault(product, -99);
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 7);

        System.out.println("prices:");
        System.out.println("milk: " + warehouse.price("milk"));
        System.out.println("coffee: " + warehouse.price("coffee"));
        System.out.println("sugar: " + warehouse.price("sugar"));

    }
}
