import java.util.Scanner;

public class IndexWasNotFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];

        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;

        System.out.println("Search for? ");
        int search = Integer.parseInt(scanner.next());

        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                index = i;
                System.out.println(search + " was found at " + index);
                break;
            } else {
                continue;
            }
        }
        if (index == -1) {
            System.out.println(search + " was not found");
        }
    }
}
