package 생성자;

class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed = 200;
    private int currentSpeed = 50;

    /*
    Car(String modelName, int modelYear, String color, int maxSpeed) {

        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
    */
    public String getModel() {

        return this.modelYear + "년식 " + this.modelName + " " + this.color;

    }

    public String getSpeed() {
        return this.maxSpeed + "최고 속도 지만 현재는" + this.currentSpeed + "입니다.";
    }
}
public class ConstructorTest {
    public static void main(String[] args) {
        //Car myCar = new Car("투싼", 2022, "아마존그레이", 200); // 생성자의 호출
        Car myCar = new Car(); // 생성자의 호출
        System.out.println(myCar.getSpeed()); // 생성자에 의해 초기화되었는지를 확인함.
    }
}
/**
 * 생성자를 선언하지 않는다면 기본생성자가 생성됩니다. 그럴경우 인스턴스 변수에 초기값을 설정하여 호출한다면 값이 출력됩니다.
 * 그러나 하나의 생성자라도 선언이 된다면 기본생성자는 생성되지 않습니다. 
 * 
 * this 참조 변수는 인스턴스가 자기자신을 참조하는 데 사용하는 변수이다. 
 * 이러한 this 참조 변수는 해당 인스턴스의 주소를 가리키고 있다. 
 */