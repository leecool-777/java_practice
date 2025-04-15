package sparta.car;

public class CarMain {
    public static void main(String[] args) {
        Car electricCar = new Car("Electric");

        electricCar.drive();
        electricCar.accelerate();
        System.out.println("연료타입: " + electricCar.getFuelType());
    }
}
