//Find average of two numbers
//concept of type casting
import java.util.Scanner;
public class AverageOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.parseInt(scanner.nextLine());

        double average = ( (double) num1 + num2) / 2;
        System.out.println("The average is " + average);
    }
}
