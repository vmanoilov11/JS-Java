import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float inch = scanner.nextFloat();
        float cm = inch * 2.54f;
        System.out.printf("%.2f", cm);
        
    }
}
