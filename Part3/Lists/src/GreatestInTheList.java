import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInTheList {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num == -1) {
                break;
            }

            myList.add(num);
        }

        int greatest = myList.get(0);
        for (int i = 0; i < myList.size(); i++) {
            int number = myList.get(i);
            if (number > greatest) {
                greatest = number;
            }
        }

        int smallest = myList.get(0);
        for (int i = 0; i < myList.size(); i++) {
            int number = myList.get(i);
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("The greatest number: " + greatest);
        System.out.println("The smallest number: " + smallest);
    }
}
