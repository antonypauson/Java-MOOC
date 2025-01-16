public class Container {
    private int amount;

    public Container() {

    }

    public int contains() {
        return amount;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (amount + this.amount < 100) {
                this.amount += amount;
            } else {
                this.amount = 100;
            }
        }
    }

    public String toString() {
        return amount + "/100";
    }

    public void remove (int amount) {
        if (this.amount - amount > 0) {
            this.amount -= amount;
        } else {
            this.amount = 0;
        }
    }
    public static void main(String[] args) {
        Container container = new Container();
        System.out.println(container);

        container.add(50);
        System.out.println(container.contains());

        container.remove(60);
        System.out.println(container);

        container.add(200);
        System.out.println(container);
    }
}
