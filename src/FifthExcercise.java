import java.util.Random;
import java.util.Scanner;

public class FifthExcercise {
    public static void main(String[] args) {
        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int nextInt;
        do {
            System.out.println("Podaj liczbę od 1 do 100");
            nextInt = scanner.nextInt();
            if (nextInt == randomInt) {
                System.out.println("Brawo zgadles moją liczbe");
            } else if (nextInt < randomInt) {
                System.out.println("Moja liczba jest większa od Twojej");
            } else
                System.out.println("Moje liczba jest mniejsza od Twojej");
        } while (randomInt!=nextInt);
    }

}
