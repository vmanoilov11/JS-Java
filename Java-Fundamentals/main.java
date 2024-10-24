public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            int initialSpeed = Integer.parseInt(args[0]);

            SimpleCar car = new SimpleCar(initialSpeed);

            car.accelerate();
            car.accelerate();
            car.accelerate();
        }
    }
}
