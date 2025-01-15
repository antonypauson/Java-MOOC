import java.util.Scanner;
public class UI {
    private Scanner scanner;
    private Birds birds;

    public UI(Scanner scanner, Birds birds) {
        this.scanner = scanner;
        this.birds = birds;
    }

    public void start() {


        while (true) {
            System.out.println("?");
            String command = scanner.nextLine().trim();

            if (command.equals("Add")) {
                System.out.println("Name:");
                String bName = scanner.nextLine();
                System.out.println("Name in Latin:");
                String lName = scanner.nextLine();

                addBird(bName, lName);
            }

            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String observedBird = scanner.nextLine();
                birds.addObserved(observedBird);
            }

            if (command.equals("All")) {
                System.out.println("Lets print all birds");
                System.out.println(birds);
            }

            if (command.equals("Quit")) {
                break;
            }
        }

    }

    private void addBird(String bName, String lName) {
        birds.addBirdToBirds(bName, lName);
        System.out.println(birds);
    }
}
