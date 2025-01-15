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
        readFull(file);
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        while (true) {
            System.out.println("Enter the command:");

            String command = scanner.nextLine();

            if (command.equals("list")) {

                System.out.println("Recipes:");
                System.out.println(recipe);
                printListMode();
            }

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String searchWord = scanner.nextLine();
                printListWithName(searchWord);
            }

            if (command.equals("find cooking time")) {
                System.out.println("Max Cooking Time:");
                int maxCookingTime = Integer.parseInt(scanner.nextLine());
                printListWithCookingTime(maxCookingTime);
            }
        }
    }

    private void printListWithCookingTime(int maxCookingTime) {
        ArrayList<String> mylist = recipe.itemsUnderCookingTime(maxCookingTime);
        for (String list : mylist) {
            printListWithName(list);
        }
    }

    public void printListMode() {
        System.out.println(recipe.printListMode());
    }

    public void printListWithName(String itemName) {
        System.out.println(recipe.printListMode(itemName));
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
