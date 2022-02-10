package 예외처리;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            System.out.println("실제 작동되는 소스");
        }catch(Exception e) {
            System.out.println("에러가 발생하면 이쪽으로 error를 떨군다");
            System.out.println(e.getStackTrace());
            e.printStackTrace(); //해당 throwable 객체와 표준 오류 스트림(standard error stream)에서 해당 객체의 스택 트레이스(stack trace)를 출력함.
        }finally {
            System.out.println("마지막 실행");
        }
    }
}
/**
1. try 블록 : 기본적으로 맨 먼저 실행되는 코드로 여기에서 발생한 예외는 catch 블록에서 처리됩니다.
2. catch 블록 : try 블록에서 발생한 예외 코드나 예외 객체를 인수로 전달받아 그 처리를 담당합니다.
3. finally 블록 : 이 블록은 try 블록에서 예외가 발생하건 안 하건 맨 마지막에 무조건 실행됩니다.
 */