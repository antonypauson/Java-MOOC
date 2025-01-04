import java.util.ArrayList;
import java.util.Scanner;
public class SecondPlusThird {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            }

            myList.add(num);
        }
        System.out.println(myList.get(1) + myList.get(2));
    }
}
