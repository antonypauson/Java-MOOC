import java.util.Scanner;

//positive or negative
public class Positivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.parseInt(scanner.nextLine());
        if (num >= 0) {
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The number is not positive");
        }
    }
}
