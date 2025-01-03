import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        //print the number of numbers
        //print sum of numbers
        Scanner scanner = new Scanner(System.in);
        int numOfNums = 0;
        int sumOfNums = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            }

            numOfNums += 1;
            sumOfNums += num;
        }
        System.out.println("Number of numbers: " + numOfNums);
        System.out.println("Sum of numbers: " + sumOfNums);
    }
}
