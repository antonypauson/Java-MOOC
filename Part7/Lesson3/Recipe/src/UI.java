import java.io.IOException;
import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private Recipe recipe;

    public UI(Scanner scanner, Recipe recipe) {
        this.scanner = scanner;
        this.recipe = recipe;
    }


    public void start() throws IOException {
        System.out.println("let us begin the UI");
        System.out.println("File to read:");
        String file = scanner.nextLine();

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");

        while (true) {
            System.out.println("Enter the command:");

            String command = scanner.nextLine();

            if (command.equals("list")) {

                System.out.println("Recipes:");
                recipe.listRecipe(file); //ithu sheriyaakkan ind;
            }

            if (command.equals("stop")) {
                break;
            }
        }

    }
}
