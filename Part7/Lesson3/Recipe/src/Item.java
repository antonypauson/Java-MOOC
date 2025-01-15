import java.util.ArrayList;

public class Item {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Item(String name, String cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = Integer.parseInt(cookingTime);
        this.ingredients = ingredients;
    }

    public String toStringIngredients() {
        String output = "";
        for (String ingrediant : ingredients) {
            output += ingrediant + "\t";
        }
        output += "\n";
        return output;
    }
    public String toString() {
        return "Name:" + name + "\n"
                + "Cooking time: " + cookingTime + "\n"
                + "Ingredients: " + toStringIngredients();
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }


}
