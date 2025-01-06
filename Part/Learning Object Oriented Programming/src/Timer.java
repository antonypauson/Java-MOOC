public class Timer {

    private ClockHand hundredthSeconds;
    private ClockHand seconds;

    public Timer() {
        this.hundredthSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    public String toString() {
        return seconds + ":" + hundredthSeconds;
    }

    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();
        }


    }

    private void advance() {
        this.hundredthSeconds.advance();

        if (this.hundredthSeconds.value() == 0) {
            this.seconds.advance();
        }
    }
}
