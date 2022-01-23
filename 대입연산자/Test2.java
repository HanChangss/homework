package 대입연산자;

public class Test2 {
    public static void main(String[] args) {
        int num1 = 7, num2 = 7, num3 = 7;
        int num4 = 5;

        num1 = num1 - 3;
        num2 -= 3;
        num3 =- 3;
        num4 += 3;

        System.out.println("- 연산자에 의한 결과 : "+ num1);
        System.out.println("-= 연산자에 의한 결과 : "+ num2);
        System.out.println("=- 연산자에 의한 결과 : "+ num3);
        System.out.println("+= 연산자에 의한 결과 : "+ num4);

        /*
            위의 예제에서 num3 =- 3 연산은 단순히 -3를 변수 num3에 대입하는 연산이 되었습니다.
            이처럼 복합 대입 연산자에서 연산자의 순서는 매우 중요하므로 주의를 기울여야 합니다.
        */
    }
}
