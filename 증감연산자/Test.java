package 증감연산자;

public class Test {
    public static void main(String[] args) {
    int num1 = 7, num2 = 7, num3 = 3, num4 =3;

        int result1, result2, result3, result4;

        result1 = --num1 + 4;
        result2 = num2-- + 4;
        result3 = ++num3 + 5;
        result4 = num4++ + 5;



        System.out.println("전위 감소 연산자에 의한 결과 : "+ result1 + ", 변수의 값 : " + num1);
        System.out.println("후위 감소 연산자에 의한 결과 : "+ result2 + ", 변수의 값 : " + num2);
        System.out.println("전위 증가 연산자에 의한 결과 : "+ result3 + ", 변수의 값 : " + num3);
        System.out.println("전위 증가 연산자에 의한 결과 : "+ result4 + ", 변수의 값 : " + num4);

        System.out.println("~ 연산자에 의한 결과 : "+ ~num1); //1 이면 0 0이면 1로 변환(비트 NOT 연산, 1의 보수)

        System.out.println("<< 연산자에 의한 결과 : "+ (num1 << 2));

        System.out.println(">> 연산자에 의한 결과 : "+ (num2 >> 2));

        System.out.println(">>> 연산자에 의한 결과 : "+ (num1 >>> 2));

        System.out.println(">>> 연산자에 의한 결과 : "+ (num2 >>> 2));

        /*
        삼항연산자
        조건식 ? 반환값1 : 반환값2
        */

        int a = 5;
        int b = 7;
        int result;

        result = (a - b > 0) ? a:b;
        System.out.println("두 정수 중 더 큰 수는 " + result + "입니다.");
    }
}
