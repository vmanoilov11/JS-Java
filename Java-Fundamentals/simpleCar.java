public class SimpleCar{
    int speed;

        public SimpleCar(int initialSpeed) {
            this.speed = initialSpeed;
        }
        public void accelerate(){
            speed += 10;
            System.out.println("Speed after accelerate: " + speed);
        }
}
