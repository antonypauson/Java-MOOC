import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String trans = scanner.nextLine();

                dict.addToDict(new Words(word, trans));
            } else if (input.equals("search")) {
                System.out.println("To be translated:");
                String word = scanner.nextLine();

                System.out.println("Translation:" + dict.translate(word));
            }
            else {
                System.out.println("Unknown command");
            }
        }


    }
}
