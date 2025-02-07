import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
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

        System.out.println("Print the average of positive numbers or negative numbers: n/p? ");
        String input = scanner.nextLine();

        if (input.equals("n")) {
            double average = myList.stream()
                    .mapToInt(m -> Integer.parseInt(m))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();

            System.out.println("Average of negative " + average);
        } else {
            double average = myList.stream()
                    .mapToInt(n -> Integer.parseInt(n))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of positive " + average);
        }
}
}
