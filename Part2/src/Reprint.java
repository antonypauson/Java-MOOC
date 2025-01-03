//ask user for a number
//a phrase will be printed that number of times

import java.util.Scanner;

public class Reprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int num = Integer.parseInt(scanner.nextLine());

        while (num > 0) {
            printText();
            num--;
        }
    }

    private static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
