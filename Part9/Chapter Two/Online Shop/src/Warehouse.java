import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        return this.prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.stocks.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (this.stocks.containsKey(product) && this.stock(product) > 0) {
            int currentStock = this.stocks.get(product);
            this.stocks.put(product, currentStock - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return this.prices.keySet();
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 6);
        warehouse.addProduct("buttermilk", 2, 20);
        warehouse.addProduct("yogurt", 2, 20);

        System.out.println("products:");

        for (String product : warehouse.products()) {
            System.out.println(product);
        }
    }
}
