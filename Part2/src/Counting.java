import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        //print from 0 to entered number
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
}
