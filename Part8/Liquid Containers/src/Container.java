public class Container {
    private int first;
    private int second;

    public Container() {
        this.first = 0;
        this.second = 0;
    }

    public String toString() {
        return "First: " + first + "/100\nSecond: " + second + "/100\n";
    }

    public void addToContainer(int value) {
        if (value > 0) {
            if (first + value <= 100) {
                first += value;
            } else {
                first = 100;
            }
        }
    }

    public int getFirst() {
        return first;
    }

    public void moveToContainer(int amount) {
        if (second + amount < 100) {
            second += amount;
        } else {
            second = 100;
        }
        first -= amount;
    }

    public void removeFromContainer(int amount) {
        if (second - amount > 0) {
            second -= amount;
        } else {
            second = 0;
        }
    }
}
