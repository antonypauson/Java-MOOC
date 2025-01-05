import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String theString = scanner.nextLine();

            if (theString.isEmpty()) {
                break;
            }

            String[] words = theString.split(" ");

            for (String word : words) {
                System.out.println(word);
            }
        }
    }
}