import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        //read until user enters "end
        //if its not end, handle the input as integer
        //print cube of integer

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("ends")) {
                break;
            }

            int intInput = Integer.parseInt(input);
            System.out.println(intInput * intInput * intInput);
        }
    }
}
