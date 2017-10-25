import java.util.Scanner;

/**
 * Created by Damian on 25.10.2017.
 */
public class TaskEight {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n:");
        int n = scanner.nextInt();
        int score = 0;

        for (int i = 2; i <= n * 2;i = i + 2){
            score = score + i;
        }
        System.out.println("Suma n początkowych liczb parzystych wynosi: "+score);
    }
}
