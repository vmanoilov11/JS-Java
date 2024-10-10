import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;


        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();

            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }
        }

        System.out.printf("Max number: %d%n", maxNumber);
        System.out.printf("Min number: %d%n", minNumber);

        scanner.close();
    }
}
