import java.util.Scanner;

/**
 * Created by Damian on 25.10.2017.
 */
public class TaskSix {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        final String secretPassword = "Akademia";
        String password;

        do {
            System.out.println("Podaj hasło:");
            password = scanner.next();
        }while (!password.equals(secretPassword));
        System.out.println("Podałeś poprawne hasło");
    }
}
