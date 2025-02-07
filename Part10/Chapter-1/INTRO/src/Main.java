import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            inputs.add(row);
        }

        long numbersDivisibleByThree = inputs.stream()
                .mapToInt(s -> Integer.parseInt(s))
                .filter(number -> number % 3 == 0)
                .count();

        double average = inputs.stream()
                .mapToInt(n -> Integer.parseInt(n))
                        .average()
                                .getAsDouble();

        System.out.println("Divisible By Three " + numbersDivisibleByThree);
        System.out.println("Average number " + average);
    }
}
