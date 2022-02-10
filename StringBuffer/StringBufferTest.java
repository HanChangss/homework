package StringBuffer;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("java");
        System.out.println("원본 문자열 : " + str);

        System.out.println(str.append("수업"));
        System.out.println("append() 메소드 호출 후 원본 문자열 : " + str);

        //capacity() 메소드는 buffer크기를 알려주는 메소드
        StringBuffer str01 = new StringBuffer();
        StringBuffer str02 = new StringBuffer("Java");

        System.out.println(str01.capacity());
        System.out.println(str02.capacity());

        //delete() 메소드는 전달된 인덱스에 해당하는 부분 문자열을 해당 문자열에서 제거합니다.
        //deleteCharAt() 메소드를 사용하면 특정 위치의 문자 한 개만을 제거할 수도 있습니다.
        StringBuffer str03 = new StringBuffer("Java Oracle");

        System.out.println("원본 문자열 : " + str03);
        
        System.out.println(str03.delete(4, 8));
        System.out.println(str03.deleteCharAt(1));
        System.out.println("deleteCharAt() 메소드 호출 후 원본 문자열 : " + str03);

        //insert() 메소드 인수로 전달된 값을 문자열로 변환한 후, 해당 문자열의 지정된 인덱스 위치에 추가합니다.
        //이때 전달된 인덱스가 해당 문자열의 길이와 같으면, append() 메소드와 같은 결과를 반환합니다.
        StringBuffer str04 = new StringBuffer("Java 만세!!");

        System.out.println("원본 문자열 : " + str04);
        
        System.out.println(str04.insert(4, "Script"));
        System.out.println("insert() 메소드 호출 후 원본 문자열 : " + str04);
    }
}
