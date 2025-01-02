import java.util.Scanner;
public class DifferentInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String stringVal = scanner.nextLine();

        System.out.println("Give an integer:");
        int intVal = Integer.parseInt(scanner.nextLine()); //convert to integer

        System.out.println("Give a double:");
        double doubleVal = Double.parseDouble(scanner.nextLine()); //convert to double

        System.out.println("Give a boolean");
        boolean boolVal = Boolean.parseBoolean(scanner.nextLine());//convert to boolean

        System.out.println("You gave the string: " + stringVal);
        System.out.println("You gave the integer: " + intVal);
        System.out.println("You gave the double: " + doubleVal);
        System.out.println("You gave the boolean: " + boolVal);
    }
}
