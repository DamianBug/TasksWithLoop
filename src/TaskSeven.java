import java.util.Scanner;

/**
 * Created by Damian on 25.10.2017.
 */
public class TaskSeven {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokość wieży:");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++){
            System.out.print("O");

            for (int j = 1; j < i; j++){
                System.out.print("O");
            }
            System.out.println();
        }
    }
}
