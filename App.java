public class App {
    public static void main(String[] args) throws Exception {
        /* 기본 자료형 변수 8개 */
        // 정수형 byte, short, int, long & 문자형 char 글자하나 입력시
        System.out.println("byte 입력범위: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE );
        System.out.println("short 입력범위: " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int 입력범위: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long 입력범위: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        // 실수형 float, double
        System.out.println("float 입력범위: " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        System.out.println("double 입력범위: " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
        // 불린형(참,거짓) boolean
        System.out.println("boolean 입력범위: " + Boolean.FALSE + " ~ " + Boolean.TRUE);
        
        /* 참조형 변수 4개 */
        // 클래스: Class, 인터페이스: Interface, 배열: Array, 열거: Enum
        
        /* 명시적 형변환 */
        int i = 128;
        System.out.println("int -> byte 형변환: " + (byte) i);

        /* 산술연산자 */
        // 덧셈 + , 빼기 - , 곱하기 * , 나누기 / , 나머지 %
        System.out.println("더하기: " + (5 + 5));
        System.out.println("빼기: " + (5 - 4));
        System.out.println("곱하기: " + (5 * 3));
        System.out.println("나누기: " + (5 / 2));
        System.out.println("나머지: " + (5 % 2));
        
        /* 자동증감 연산자 */
        int plus = 5;
        System.out.println("전취증가: " + plus++);
        System.out.println("후취증가: " + ++plus);
        int minus = 5;
        System.out.println("전취감소: " + minus--);
        System.out.println("후취감소: " + --minus);

        /* 프로그램용 특수문자 */
        // 탭 \t , 줄바꿈 \n , 백스페이스 \b , carriage return \r , single quotation \' , double quotation \" , unicode \\
        System.out.println("Hello\tworld");
        System.out.println("Hello\nworld");
        System.out.println("Hello\bworld");
        System.out.println("Hello\rworld");
        System.out.println("Hello\'world");
        System.out.println("Hello\"world");
        System.out.println("Hello\\world");

        /* 삼항연산자 */
        boolean trueFlag = true;
        boolean falseFlag = false;
        System.out.println(trueFlag ? falseFlag : trueFlag);

        /* 제어문 */
        int value = 6;
        if(value > 5) {
            System.out.println("value bigger than 5");
        } else if(value < 5) {
            System.out.println("value small than 5");
        } else {
            System.out.println("value is 5");
        }

        /* 제어문&연산자 조합 */
        if(value == 6) {
            System.out.println("value is 6");
        }
        if(value != 6) {
            System.out.println("value is not 6");
        }
        if(value != 6) {
            System.out.println("value is not 6");
        }
    }
}