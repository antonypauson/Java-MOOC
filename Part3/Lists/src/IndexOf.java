import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num == -1) {
                break;
            }

            myList.add(num);
        }
        System.out.println("Search for?");
        int number = Integer.parseInt(scanner.next());

        for (int i = 0; i <= myList.size(); i++) {
            if (number == myList.get(i)) {
                System.out.println(number + " is at index " + i);
                break;
            }
        }
    }
}
