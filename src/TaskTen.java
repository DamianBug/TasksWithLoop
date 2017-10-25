import java.util.Scanner;

/**
 * Created by Damian on 25.10.2017.
 */
public class TaskTen {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        String number = scanner.next();

        System.out.println("Ilość cyfr podanej liczby: "+number.length());
    }
}
