import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        cart = new HashMap<>();
    }

    public void add(String product, int price) {
        Item item = new Item(product, 1, price);
        this.cart.put(product, item);
    }

    public int price() {
        int totalPrice = 0;
        for (Item item : cart.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.add("milk", 3);
        cart.add("buttermilk", 2);
        cart.add("cheese", 5);

        System.out.println("cart price: " + cart.price());

        cart.add("computer", 899);
        System.out.println("cart price: " + cart.price());
    }
}
