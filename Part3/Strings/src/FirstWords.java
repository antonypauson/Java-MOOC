import java.util.Scanner;

public class FirstWords {
    public static void main(String[] args) {
        //prints the first word
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] words = input.split(" ");
            System.out.println(words[0]);
        }
    }
}
