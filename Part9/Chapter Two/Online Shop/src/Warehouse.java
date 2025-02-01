import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private Map<String, Integer> product;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.product = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.product.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        return this.product.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.stock.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (this.stock.containsKey(product) && this.stock(product) > 0) {
            int currentStock = this.stock.get(product);
            this.stock.put(product, currentStock - 1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 1);

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));

        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking sugar " + warehouse.take("sugar"));

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));
    }
}
