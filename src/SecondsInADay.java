//Program to convert number of days into seconds
import java.util.Scanner;
public class SecondsInADay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int value = Integer.parseInt(scanner.nextLine()); //read int
        System.out.println(value * 86400);
    }
}
