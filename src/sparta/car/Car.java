package sparta.car;

public class Car {
    private String fuelType;

    public Car(String fuelType) {
        this.fuelType = fuelType;
    }

    public void drive() {
        System.out.println("주행을 시작합니다.");
    }

    public void accelerate() {
        System.out.println("가속을 시작합니다.");
    }

    public String getFuelType() {
        return fuelType;
    }
}
