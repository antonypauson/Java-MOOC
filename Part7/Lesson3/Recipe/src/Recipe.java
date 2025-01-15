import java.util.ArrayList;

public class Recipe {
    private ArrayList<Item> items;

    public Recipe() {
        this.items = new ArrayList<>();
    }

    public void addToRecipe(ArrayList<String> rowList) {
        ArrayList<String> ingredients = new ArrayList<>();
        for (int i = 2; i < rowList.size(); i++) {
            ingredients.add(rowList.get(i));
        }
        Item item = new Item(rowList.get(0), rowList.get(1), ingredients);
        items.add(item);
    }

    public void setRecipe(ArrayList<String> rowList) {
        if (rowList.size() >= 3) {
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

    public String printListMode(String itemName) {
        String output = "Recipes: \n";
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                output += item.getName() + ", cooking time: " + item.getCookingTime() + "\n" ;
            }
        }
        return output;
    }

    public ArrayList<String> itemsUnderCookingTime(int maxCookingTime) {
        ArrayList<String> myArray = new ArrayList<>();
        for (Item item : items) {
            if (item.getCookingTime() <= maxCookingTime) {
                myArray.add(item.getName());
            }
        }
        return myArray;
    }

    public ArrayList<String> itemsUnderIngredients(String ingredient) {
        ArrayList<String> myArray = new ArrayList<>();
        for (Item item : items) {
            for (String singleIngredient : item.getIngredients()) {
                if (singleIngredient.equals(ingredient)) {
                    myArray.add(item.getName());
                }
            }
        }

        return myArray;
    }

}
