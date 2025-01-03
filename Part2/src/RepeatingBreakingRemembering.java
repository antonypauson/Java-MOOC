import java.util.Scanner;
//no of even, odd
//average of all
//sum of all
//number of numbers
public class RepeatingBreakingRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");

        int sum = 0;
        int numOfNums = 0;
        int evenNums = 0;
        int oddNums = 0;
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num == -1) {
                System.out.println("Thx!Bye");
                break;
            }

            sum += num;
            numOfNums += 1;
            if (num % 2 == 0) {
                evenNums += 1;
            } else {
                oddNums += 1;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numOfNums);
        System.out.println("Average: " + ((double) sum / numOfNums) );
        System.out.println("Even: " + evenNums);
        System.out.println("Odd: " + oddNums);
    }
}
