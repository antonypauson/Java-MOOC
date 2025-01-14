import java.util.Scanner;

public class Points {

    private static int sum = 0;
    private static int count = 0;


    public static int findSum(int num) {
        sum += num;
        count++;
        return sum;
    }

    public static double findAverage(int sum) {
        return (double) sum / count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int point = Integer.parseInt(scanner.nextLine());

            if (point == -1) {
                break;
            }

            if (point >= 0 && point <= 100) {
                //find average
                sum = Points.findSum(point);
            }
        }
        System.out.println("Point average (all): " + Points.findAverage(sum));

    }
}
