import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a year:");
        int year = Integer.parseInt(scanner.nextLine());

        if (year % 4 != 0) {
            System.out.println("Not a Leap Year");
        } else if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("LEAP!");
            } else {
                System.out.println("Not a Leap Year");
            }
        } else {
            System.out.println("LEAP!");
        }
    }
}
