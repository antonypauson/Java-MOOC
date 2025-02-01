import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (cart.containsKey(product)) {
            Item item = this.cart.get(product);
            item.increaseQuantity();
        } else {
            Item item = new Item(product, 1, price);
            this.cart.put(product, item);
        }

    }

    public int price() {
        int totalPrice = 0;
        for (Item item : cart.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item item : cart.values()) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.add("milk", 3);
        cart.print(); //product: quantity
        System.out.println("cart price: " + cart.price() + "\n"); //price * quantity

        cart.add("buttermilk", 2);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("buttermilk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");
    }
}
