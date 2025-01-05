import java.util.Scanner;

public class LastWords {
    public static void main(String[] args) {
        //print last word of the string
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] words = input.split(" ");
            System.out.println(words[words.length - 1]);
        }
    }
}
