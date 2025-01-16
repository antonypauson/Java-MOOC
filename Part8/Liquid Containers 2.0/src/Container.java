public class Container {
    private int amount;

    public Container() {
        this.amount = 0;
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
        return amount + "/100\n";
    }

    public void remove (int amount) {
        if (this.amount - amount > 0) {
            this.amount -= amount;
        } else {
            this.amount = 0;
        }
    }

}
