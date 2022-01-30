package 조건문;

public class Test {
    public static void main(String[] args) {
        /*
            switch문은 if/else문 보다 가독성이 더 좋으며, 컴파일러가 최적화를 쉽게 할 수 있어 속도 또한 빠른 편
            하지만 swtich문의 조건 값으로는 int형으로 승격할 수 있는 값만이 사용될 수 있다.
            조건 값으로 byte, short, char, int 변수나 리터럴을 사용할 수 있습니다.
        */

        int a = 0;
        String b = "안녕";
        /*
        switch(a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
        }
        */
        switch(b) {
            case "안녕":
                System.out.println("안녕입니다.");
                break;
            case "잘가":
                System.out.println("잘가입니다.");
                break;
            case "사랑해":
                System.out.println("사랑해입니다.");
                break;
            default:
                System.out.println("아무것도 아니다");
                break;
        }
    }
}
