abstract class Vehicle {
    protected int speed;
    protected int fuel;

    public Vehicle(int initialSpeed, int initialFuel) {
        this.speed = initialSpeed;
        this.fuel = initialFuel;
    }
    public abstract void accelerate();
    public abstract void brake();
}
