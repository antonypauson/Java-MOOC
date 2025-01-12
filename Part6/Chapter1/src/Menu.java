import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        this.meals.add(meal);
    }

    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        this.meals = new ArrayList<>();
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addMeal("Biriyani");
        menu.addMeal("Chilli Gopi");
        menu.addMeal("MeatBALLS");

        menu.printMeals();
        menu.clearMenu();

    }
}
