import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        //sum until 0
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            }

            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}
