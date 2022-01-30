package 반복문;

public class Test {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while(i < 5) {
            System.out.println("while 문이" + (i+1) + "번째 반복 실행중입니다.");
            i++;
        }
        System.out.println("while 문이 종료된 후 변수 i의 값은" + i +"입니다.");

        do {

            System.out.println("do / while 문이 " + i + "번째 반복 실행중입니다.");
        
            j++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.
        
        } while (j < 1);
        
        System.out.println("do / while 문이 종료된 후 변수 j의 값은 " + j + "입니다.");
    }
}
