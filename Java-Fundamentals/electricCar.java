class ElectricCar extends Vehicle {

    public ElectricCar(int initialSpeed, int initialBattery) {
        super(initialSpeed, initialBattery);
    }

    @Override
    public void accelerate() {
        if (fuel > 0) {
            speed += 10;
            fuel --;
            System.out.println("Speed after accelerate: " + speed + ", Battery left: " + fuel);
        } else {
            System.out.println("Battery empty!");
        }
    }

    @Override
    public void brake() {
        speed -= 20;
        System.out.println("Speed after brake: " + speed);
    }
}
