import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculateDiagonalSums();
    }

    public static void calculateDiagonalSums() {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int sumWithDuplicates = 0;
        int sumWithoutDuplicates = 0;

        for (int i = 0; i < 3; i++) {
            sumWithDuplicates += matrix[i][i];
        }

        for (int i = 0; i < 3; i++) {
            sumWithDuplicates += matrix[i][2 - i];
        }

        for (int i = 0; i < 3; i++) {
            sumWithoutDuplicates += matrix[i][i];
            if (i != 2 - i) {
                sumWithoutDuplicates += matrix[i][2 - i];
            }
        }

        System.out.printf("Сума с повторение: %d, Сума без повторение: %d%n", sumWithDuplicates, sumWithoutDuplicates);

        scanner.close();
    }
}
