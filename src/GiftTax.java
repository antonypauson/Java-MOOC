import java.util.Scanner;

public class GiftTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.parseInt(scanner.nextLine());

        if (value >= 5000 && value < 25000) {
            int lowerLimit = 100;
            double taxRate = 0.08;
            double result = (lowerLimit + (value - 5000) * taxRate);
            System.out.println("Tax " + result);
        } else if (value >= 25000 && value < 55000) {
            int lowerLimit = 1700;
            double taxRate = 0.10;
            double result = (lowerLimit + (value - 25000) * taxRate);
            System.out.println("Tax " + result);
        } else if (value >= 55000 && value < 200000) {
            int lowerLimit = 4700;
            double taxRate = 0.12;
            double result = (lowerLimit + (value - 55000) * taxRate);
            System.out.println("Tax " + result);
        } else {
            System.out.println("No Tax");
        }
    }
}
