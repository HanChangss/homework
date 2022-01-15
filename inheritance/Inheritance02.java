package inheritance;

public class Inheritance02 {
    public static void main(String[] args) {
        Parent pa = new Parent();

        pa.display();

        Child ch = new Child();

        ch.display2();

        Parent pc = new Child();

        pc.display(); // Child cp = new Parent();
        //오버라이딩에서는 같은 메소드의 자식클래스의 데이터를 출력하기때문에 맞춰줘야합니다.
    }
}
