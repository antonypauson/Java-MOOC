import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();

        while (true) {
            int num = Integer.parseInt(scanner.next());

            if (num == -1) {
                break;
            }
            myList.add(num);
        }

        int sum = 0;
        for (int number: myList) {
            sum += number;
        }
        System.out.println(sum);
    }
}
