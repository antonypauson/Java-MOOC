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
            }
        }
    }

    public int getFirst() {
        return first;
    }
}
