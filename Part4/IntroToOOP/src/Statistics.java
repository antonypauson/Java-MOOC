import java.util.Scanner;
//find sum of all numbers
//sum of even numbers only
//sum of odd numbers only

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    private double average() {
        return (double) this.sum / this.count;
    }

    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics oddNum = new Statistics();
        Statistics evenNum = new Statistics();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num == -1) {
                break;
            }
            statistics.addNumber(num);
            if (num % 2 == 0) {
                evenNum.addNumber(num);
            } else {
                oddNum.addNumber(num);
            }
        }

//        System.out.println("Count: " + statistics.getCount());

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of odd numbers: " + oddNum.sum());
        System.out.println("Sum of even numbers: " + evenNum.sum());
//        System.out.println("Average: " + statistics.average());
    }
}
