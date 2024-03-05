package This와This;
// this: this 참조변수는 인스턴스가 자기 자신을 참조하는데 사용하는 변수

public class ThisEx {
    public static void main(String[] args) {
        Car car = new Car("Sonata", 2024, "Gray", 220);
    }
}
class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
}