import java.util.Scanner;

public class FirstExcercise {
    public static void main(String[] args) {

        System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        nextInt = Math.abs(nextInt);
        System.out.println(nextInt);
    }
}
