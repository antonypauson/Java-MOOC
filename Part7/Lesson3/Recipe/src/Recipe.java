import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Recipe {
    private ArrayList<Item> items;

    public Recipe() {
        this.items = new ArrayList<>();
    }

    public void addToRecipe(ArrayList<String> rowList) {
        //recipe aakanam
        ArrayList<String> ingredients = new ArrayList<>();
        for (int i = 2; i < rowList.size(); i++) {
//            System.out.println("\t" + rowList.get(i));
            ingredients.add(rowList.get(i));
        }
        Item item = new Item(rowList.get(0), rowList.get(1), ingredients);
        items.add(item);
    }

    public void setRecipe(ArrayList<String> rowList) {
        if (rowList.size() >= 3) {
//            System.out.println("Name: " + rowList.get(0));
//            System.out.println("Hours: " + rowList.get(1));
//            System.out.println("First item: " + rowList.get(2));

            addToRecipe(rowList);
        } else {
            System.out.println("Something is wrong");
        }
    }

    public String toString() {
        String output = "";
        for (Item item : items) {
            output += item;
        }
        return output;
    }

    public String printListMode() {
        String output = "Recipes:\n";
        for (Item item : items) {
            output += item.getName() + ", cooking time: " + item.getCookingTime() + "\n" ;
        }
        return output;
    }
}
