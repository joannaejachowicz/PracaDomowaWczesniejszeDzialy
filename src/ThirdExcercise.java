import java.util.Scanner;

public class ThirdExcercise {
    public static void main(String[] args) {
        System.out.println("Podaj 3 liczby");
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        int nextInt1 = scanner.nextInt();
        int nextInt2 = scanner.nextInt();

        if (nextInt <= nextInt1 && nextInt <= nextInt2) {
            System.out.println("najmniejsza licza z podanych to " + nextInt);
        } else if (nextInt1 <= nextInt2) {
            System.out.println("najmniejsza licza z podanych to " + nextInt1);

        } else {
            System.out.println("najmniejsza licza z podanych to " + nextInt2);
        }
    }
}
