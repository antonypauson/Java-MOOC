import java.util.Scanner;

//Prints Orwell if 1984
public class Orwell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int year = Integer.parseInt(scanner.nextLine());
        if (year == 1984) {
            System.out.println("Orwell");
        }
    }
}
