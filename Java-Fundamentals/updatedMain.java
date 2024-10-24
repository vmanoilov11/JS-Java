public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            int initialSpeed = Integer.parseInt(args[0]);
            int fuel = Integer.parseInt(args[1]);

            SimpleCar car = new SimpleCar(initialSpeed, fuel);
            Vehicle electricCar = new ElectricCar(initialSpeed, fuel);

            car.accelerate();
            car.accelerate();
            car.accelerate();

            electricCar.accelerate();

            //car.brake();
            //car.brake();
            //car.brake();
        }
    }
}
