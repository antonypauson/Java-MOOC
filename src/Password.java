import java.util.Scanner;
//password
//Caput Draconis -> Welcome
//else -> Off with you
public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password?");
        String passwd = scanner.nextLine();

        if (passwd.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
