import java.util.Scanner;

public class SecondExcercise {
    public static void main(String[] args) {
        while(true){ //pętla dodana żeby było fajniej testować
            System.out.println("Podaj liczbe");
            Scanner scanner = new Scanner(System.in);
            int nextInt = scanner.nextInt();
            if (nextInt % 2 == 0) {
                System.out.println("liczba jest parzysta");
            } else {
                System.out.println("liczba jest nieparzysta");
            }
        }
    }
}