package inheritance;

public class Child extends Parent{
    //public int c = 30;
    int a = 20;
    
    void display2() {
        System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);

        System.out.println(super.a); // 상속의 개념이므로 부모 클래스에서 정의 된 값을 출력

        System.out.println(this.a); //this 이기 때문에 해당 클래스에 정의 된 값을 출력
    }

    void display() {
        System.out.println("자식 클래스입니다.");
    }
}
