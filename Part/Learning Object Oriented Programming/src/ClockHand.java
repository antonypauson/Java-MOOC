import java.time.Clock;

public class ClockHand {

    private int value; //current value of sec,mins,hrs
    private int limit; //maximum value eg: 60s, 24hrs, 60min

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        this.value = this.value + 1;

        if (this.value == this.limit) {
            this.value = 0;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }

        return "" + this.value;

    }

    public static void main(String[] args) {
        ClockHand seconds = new ClockHand(60);
        ClockHand minutes = new ClockHand(60);
        ClockHand hours = new ClockHand(24);

        int count = 0;
        while (true) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            seconds.advance();

            if (seconds.value() == 0) {
                minutes.advance();

                if (minutes.value() == 0) {
                    hours.advance();
                }
            }
            count++;

            if (count > 70) {
                break;
            }
        }
    }

}
