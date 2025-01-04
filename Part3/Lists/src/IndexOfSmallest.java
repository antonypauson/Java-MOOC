import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();

        while (true) {
            int num = Integer.parseInt(scanner.next());

            if (num == 9999) {
                break;
            }
            myList.add(num);
        }

        int smallest = myList.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) < smallest) {
                smallest = myList.get(i);
                smallestIndex = i;
            }
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + smallestIndex);

    }
}
