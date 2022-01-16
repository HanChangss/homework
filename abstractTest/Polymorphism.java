package abstractTest;

public class Polymorphism {
    public static void main(String[] args) {
        //Animanl은 추상클래스이기 때문에 인스턴스를 생성할 수 없다

        Cat cat = new Cat();
        Dog dog = new Dog();

        Animal animal = new Cat(); //다형성의 예시 
        Animal animal2 = new Dog(); //다형성의 에시

        cat.cry();
        dog.cry();


        /*
        추상메소드 사용목적 
        자바에서 추상 메소드를 선언하여 사용하는 목적은 추상 메소드가 포함된 클래스를 상속받는 자식 클래스가 반드시 추상 메소드를 구현하도록 하기 위함입니다.
        */
    }
}
