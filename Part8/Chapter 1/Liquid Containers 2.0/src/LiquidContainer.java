public class LiquidContainer {
    private Container first;
    private Container second;


    public LiquidContainer() {
        this.first = new Container();
        this.second = new Container();
    }

    public void addToFirst(int amount) {
        this.first.add(amount);
    }

    @Override
    public String toString() {
        return first.toString() + second.toString();
    }

    public void moveToContainer(int amount) {

        if (first.contains() - amount > 0) {
            first.remove(amount);
            second.add(amount);
        } else {

            second.add(first.contains());
            first.remove(100);
        }
    }

    public void removeFromSecond(int amount) {
        second.remove(amount);
    }
}
