import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {
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
        System.out.println(myList.get(0));
        System.out.println(myList.get(myList.size() - 1));
    }
}
