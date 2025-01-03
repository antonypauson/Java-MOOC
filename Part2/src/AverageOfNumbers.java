import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numOfNums = 0;
        double sumOfNums = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            }

            numOfNums += 1;
            sumOfNums += num;
        }
        System.out.println("Average of numbers: " + (sumOfNums / numOfNums));
    }
}
