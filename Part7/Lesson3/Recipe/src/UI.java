import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
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
                readFull(file);
                System.out.println(recipe);
                printListMode();
            }

            if (command.equals("stop")) {
                break;
            }
        }
    }

    private void printListMode() {
        System.out.println(recipe.printListMode());
    }

    public void readFull(String file) throws IOException {
        System.out.println("reading file");
        Scanner fileScanner = new Scanner(Paths.get(file));
        ArrayList<String> rowList = new ArrayList<>();

        while (fileScanner.hasNextLine()) {
            String row = fileScanner.nextLine();
//            System.out.println(row);

            if (!(row.isEmpty())) {
                rowList.add(row);
            } else {
                recipe.setRecipe(rowList);
                rowList.clear();
            }
        }

        //last recipe doesn't have an emtpy line
        //it will be added to rowList
        //but not setRecipe, as no empty line
        if (!rowList.isEmpty()) {
            recipe.setRecipe((rowList));
        }
    }

}
