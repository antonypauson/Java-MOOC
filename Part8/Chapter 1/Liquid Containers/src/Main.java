import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
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
                container.addToContainer(amount);
            }

            if (command.equals("move")) {
                container.moveToContainer(amount);
            }

            if (command.equals("remove")) {
                container.removeFromContainer(amount);
            }
        }
    }
}
