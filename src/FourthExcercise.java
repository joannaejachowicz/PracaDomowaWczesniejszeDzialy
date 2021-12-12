public class FourthExcercise {
    public static void main(String[] args) {
       int arrayAsia[] = {1,4,5,6,7,22,66};
       printSquares(arrayAsia);

    }
    public static void printSquares (int[] input){
        for (int element:
            input) {
            System.out.println(Math.pow(element, 2));
        }

    }
}
