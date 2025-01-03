import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.parseInt(scanner.next());
        int fact = 1;
        while (num > 0) {
            fact *= num;
            num--;
        }
        System.out.println("Factorial: " + fact);
    }
}
