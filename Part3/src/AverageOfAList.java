import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num = Integer.parseInt(scanner.next());

            if (num == -1) {
                break;
            }

            myList.add(num);
        }

        double sum = 0;
        for (int num : myList) {
            sum += num;
        }
        System.out.println("Average: " + (sum / myList.size()));
    }
}
