public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public void increase(int increaseBy) {
        if (this.value > 0) {
            this.value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (this.value > 0) {
            this.value -= decreaseBy;
        }
    }

    public static void main(String[] args) {

        Counter count = new Counter();
        System.out.println(count.value());

        count.decrease();

        System.out.println(count.value());
    }
}
