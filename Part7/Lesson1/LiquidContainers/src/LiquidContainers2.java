import java.util.Scanner;

public class LiquidContainers2 {
    private Container first;
    private Container second;
    private Scanner scanner;
    public LiquidContainers2(Container first, Container second, Scanner scanner) {
        this.first = first;
        this.second = second;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("First:");
            System.out.println(first);
            System.out.print("Second:");
            System.out.println(second);

            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            }

            if (command.equals("move")) {
                first.remove(amount);
                second.add(amount);
            }

            if (command.equals("remove")) {
                second.remove(amount);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LiquidContainers2 containers = new LiquidContainers2(new Container(), new Container(), scanner);
        containers.start();
    }
}
