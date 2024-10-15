import java.util.Scanner;
class SimpleCar {
    private int speed;

    public SimpleCar(int initialSpeed) {
        this.speed = initialSpeed;
    }

    public void accelerate() {
        speed += 10;
        System.out.println("Speed after accelerate: " + speed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int iniitialSpeed = scanner.nextInt();
        SimpleCar car = new SimpleCar(iniitialSpeed);

        car.accelerate();
        car.accelerate();
        car.accelerate();

    }
}
