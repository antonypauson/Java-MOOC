import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private ToDoList tasks;

    public UI(ToDoList tasks, Scanner scanner) {
        this.tasks = tasks;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.println("To add:");
                String taskName = scanner.nextLine();
                tasks.add(taskName);

            } else if (command.equals("list")) {
                tasks.print();
            } else if (command.equals("remove")) {
                System.out.println("Enter the command id:");
                int commandId = Integer.parseInt(scanner.nextLine());
                tasks.remove(commandId);
            }
        }
    }
}
