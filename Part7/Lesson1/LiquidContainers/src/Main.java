import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int first = 0;
        int second = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First:");
            System.out.println(first + "/100");
            System.out.print("Second:");
            System.out.println(second + "/100");

            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                if (first + amount <= 100) {
                    first+=amount;
                }
            }

            if (command.equals("quit")) {
                break;
            }
        }

    }

}
