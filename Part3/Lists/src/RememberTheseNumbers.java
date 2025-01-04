import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
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

        for (int index = 0; index < myList.size(); index++) {
            System.out.println(myList.get(index));
        }
    }
}
