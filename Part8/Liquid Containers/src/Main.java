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
            container.addToContainer(amount);
        }
    }
}
