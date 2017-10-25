import java.util.Scanner;

/**
 * Created by Damian on 24.10.2017.
 */
public class TaskFour {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b:");
        int b = scanner.nextInt();
        int c = a;
        int d = b;

        while (c != d){
            if (c > d){
                c = c - d;
            }else {
                d = d - c;
            }
        }
        System.out.println("NWD liczb "+a+" i "+b+" to "+c);
    }
}
