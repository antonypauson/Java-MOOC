import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> myList = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            myList.add(row);
        }

        double average = myList.stream()
                .mapToInt(s -> Integer.parseInt(s))
                .average()
                .getAsDouble();

        System.out.println("Average of the numbers: " + average);
    }
}
