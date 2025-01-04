import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            myList.add(input);
        }

        System.out.println("Search for?");
        String search = scanner.next();

        if (myList.contains(search)) {
            System.out.println( search + " was found!");
        }
    }
}
