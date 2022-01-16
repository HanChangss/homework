package inheritance;

public class Polymorphism {
    public static void main(String[] args) {
        Parent pa01 = null;

        Child ch = new Child();

        Parent pa02 = new Parent();

        Brother br = null;
        pa01 = ch;          // pa01 = (Parent)ch; 와 같으며, 타입 변환을 생략할 수 있음.
        br = (Brother)pa02; // 타입 변환을 생략할 수 없음.
        
        //br = (Brother)ch;   // 직접적인 상속 관계가 아니므로, 오류 발생.
    }
}
