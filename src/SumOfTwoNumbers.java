//Find sum of two numbers given by input
import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());
        System.out.println("The sum of the numbers is "+ (first + second));
    }
}
