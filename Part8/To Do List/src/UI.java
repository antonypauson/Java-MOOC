import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private ToDoList list;

    public UI(Scanner scanner, ToDoList list) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        System.out.println("We in start");

        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("add")) {
                System.out.println("To add: ");
                String task = scanner.nextLine();
                list.add(task);
            }

            if (command.equals("list")) {
                list.print();
            }

            if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int removeId = Integer.parseInt(scanner.nextLine());
                list.remove(removeId);
            }

            if (command.equals("stop")) {
                break;
            }
        }
    }
}
