import java.util.Scanner;

/**
 * Created by Damian on 25.10.2017.
 */
public class TaskNine {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++){
            if (number % 7 ==0){
                sum = sum + i;
            }
        }
        System.out.println("Suma początkowych liczb podzielnych przez 7 to "+sum);
    }
}
