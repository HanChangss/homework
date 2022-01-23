package 변수;

public class Test1 {
    public static void main(String[] args) {
        /*
            기본형 변수 
            - 정수형 타입 : byte(1byte), short(2byte), int(4byte), long(8byte)
            - 실수형 타입 : float(4byte), double(8byte)
            - 문자형 타입 : char(2byte)
            - 논리 타입: boolean(1byte)  

            참조형 변수는 8개의 기본형 변수를 사용하여 사용자가 직접 만들어 사용하는 변수를 의미합니다.
            주소값을 의미한다.
            - 클래스: Class, 인터페이스: Interface, 배열: Array, 열거: Enum

            기본형 참조형의 차이점
            - 기본형
            스택 영역에 저장(static이라는 단어 자체가 정적인, 움직이지 않는이라는 의미 메모리에 할당 되어 프로그램이 종료될 때 해제 되는것을 의미)
            - 참조형
            힙 영역에 저장(heap 영역의 메모리는 Garbage Collector를 통해 수시로 관리를 받음)
            * Garbage Collector 란 ?
            java 메모리 누수를 방지하기 위해 GC가 주기적으로 검사하여 메모리를 청소해준다.

            상수(Constant)
            - 변수와 마찬가지로 데이터를 저장할 수 있는 메모리 공간을 의미합니다.
            하지만 상수가 변수와 다른 점은 프로그램이 실행되는 동안 메모리에 저장된 데이터를 변경할 수 없다는 점입니다.
            상수는 선언시 무조건 초기화를 해줘야한다.
            final int AGES = 30;

            float or double 차이점 
            할당되는 메모리의 크기가 다르며 float 소수좀은 6자리 double 은 15자리까지 표현

        */
        byte num1 = 127;
        byte num2 = -128;

        num1++;
        num2--;
        System.out.println(num1);
        System.out.println(num2);
    }
}
