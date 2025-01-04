import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
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
        System.out.println("From where?");
        int start = Integer.parseInt(scanner.next());
        System.out.println("To where?");
        int end = Integer.parseInt(scanner.next());

        for (int i = start; i <= end; i++) {
            System.out.println(myList.get(i));
        }
    }
}
