import java.util.Scanner;

/**
 * Created by Damian on 25.10.2017.
 */
public class TaskFive {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n:");
        int n = scanner.nextInt();
        int score = 1;

        for (int i = 1; i <= n; i++){
            score = score * i;
        }
        System.out.println("Silnia dla liczby "+n+" wynosi "+score);

    }
}
