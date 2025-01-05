import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        //print only the numbers in the file
        //between the upper and lower bounds

        Scanner scanner = new Scanner(System.in);
        System.out.println("File?");
        String fileName = scanner.nextLine();
        System.out.println("Lower bound?");
        int lowerBound = Integer.parseInt(scanner.nextLine());
        System.out.println("Upper bound?");
        int upperBound = Integer.parseInt(scanner.nextLine());

        ArrayList<Integer> numbers = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {

            while (fileReader.hasNextLine()) {
                int singleNumber = Integer.parseInt(fileReader.nextLine());
                numbers.add(singleNumber);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int count = 0;
        for (int number : numbers) {
            if (number >= lowerBound && number <= upperBound) {
                count++;
            }
        }

        System.out.println("Numbers: " + count);
    }
}
