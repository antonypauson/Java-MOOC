import java.util.Scanner;
//if username-> alex, then password-> sunshine
//if username-> emma, then password-> haskell
//else invalid
public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = scanner.next();
        System.out.println("Enter password:");
        String password = scanner.next();

        if ((username.equals("alex") && password.equals("sunshine")) || (username.equals("emma") && password.equals("haskell"))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
