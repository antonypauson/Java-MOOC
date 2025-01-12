import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private JokeManager jokes;

    public UI(Scanner scanner, JokeManager jokes) {
        this.scanner = scanner;
        this.jokes = jokes;
    }

    public void start() {
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");

        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("1")) {
                System.out.println("Joke you want to add:");
                String joke = scanner.nextLine();
                jokes.addJoke(joke);
            }

            if (command.equals("2")) {
                System.out.println("Drawing a joke");
                System.out.println(jokes.drawJoke());
            }

            if (command.equals("3")) {
                jokes.printJokes();
            }

            if (command.equals("X")) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        UI ui = new UI(scanner, manager);
        ui.start();
    }
}
