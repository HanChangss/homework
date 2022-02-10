package 클래스;

class Method {
    int a = 10 , b = 20;

    int add() {
        return a + b;
    }

    static int add(int x, int y) {
        return x * y;
    }
}

public class ClassTest {
    public static void main(String[] args) {
        System.out.println(Method.add(20,30));
        Method a = new Method();
        System.out.println(a.add());
    }
}

/*
    static 클래스로 선언을 하면 인스턴스를 생성안하고 바로 선언 가능
    일반 메소드는 인스턴스를 생성해야 해당 메소드를 호출할 수 있다.
*/