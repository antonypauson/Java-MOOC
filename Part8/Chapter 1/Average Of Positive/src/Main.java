import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        while (true) {
            int inputNum = Integer.parseInt(scanner.nextLine());

            if (inputNum == 0) {
                break;
            }

            if (inputNum > 0) {
                sum += inputNum;
                count++;
            }
        }
        double average = findAverage(sum, count);
        if (average > 0) {
            System.out.println(average);
        } else {
            System.out.println("cannot calculate the average");
        }
    }

    public static double findAverage(int input, int count) {
        return (double) input / count;
    }
}

