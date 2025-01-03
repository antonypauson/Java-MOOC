import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPositives = 0;
        int sumOfPositives = 0;
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0) {
                numOfPositives += 1;
                sumOfPositives += num;
            }
        }
        if (numOfPositives > 0) {
            System.out.println((double) sumOfPositives / numOfPositives);
        } else {
            System.out.println("Cannot calculate average");
        }
    }
}
