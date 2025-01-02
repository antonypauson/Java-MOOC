import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int value = Integer.parseInt(scanner.nextLine()); //convert into integer
        System.out.println("Enter value is: " + value);
    }
}
