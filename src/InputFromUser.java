import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //tool for reading is made
        System.out.println("Enter 1st message:");
        String message1 = scanner.nextLine(); //reading input from user

        System.out.println("Enter 2nd message:");
        String message2 = scanner.nextLine();

        System.out.println("Enter 3rd message:");
        String message3 = scanner.nextLine();

        System.out.println("Your message 1 : " + message1);
        System.out.println("Your message 2 : " + message2);
        System.out.println("Your message 3 : " + message3);


    }
}
