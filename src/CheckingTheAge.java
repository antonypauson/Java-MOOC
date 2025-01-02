import java.util.Scanner;

//valid age from 0 - 120
public class CheckingTheAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.parseInt(scanner.nextLine());
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible");
        }
    }
}
