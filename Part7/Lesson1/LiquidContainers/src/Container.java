public class Container {
    private int liquidAmount;

    public Container() {
        this.liquidAmount = 0;
    }

    public int contains() {
        return liquidAmount;
    }

    public void add(int amount) {

        if (amount < 0) {
            return;
        }

        if (amount + liquidAmount <= 100) {
            liquidAmount += amount;
        } else {
            liquidAmount = 100;
        }
    }

    public void remove(int amount) {

        if (amount < 0) {
            return;
        }

        if (liquidAmount - amount >= 0) {
            liquidAmount -= amount;
        } else {
            liquidAmount = 0;
        }
    }

    public String toString() {
        return liquidAmount + "/100";
    }

    public static void main(String[] args) {
        Container container = new Container();
        System.out.println(container);

        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());

        container.remove(60);
        System.out.println(container);

        container.add(200);
        System.out.println(container);
    }
}
