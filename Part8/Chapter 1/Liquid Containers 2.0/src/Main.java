import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LiquidContainer container = new LiquidContainer();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(container);
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                container.addToFirst(amount);
            }

            if (command.equals("move")) {
                container.moveToContainer(amount); //work on it
            }

            if (command.equals("remove")) {
                container.removeFromSecond(amount);
            }
        }

    }
}