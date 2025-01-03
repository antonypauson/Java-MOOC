import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int sum = num1 + num2;
        double sqRoot = Math.sqrt(sum);
        System.out.println(sqRoot);
    }
}
