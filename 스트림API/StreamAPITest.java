package 스트림API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamAPITest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(4);

        list.add(2);

        list.add(3);

        list.add(1);

        // 컬렉션에서 스트림 생성 -> 스트림은 한기능의 한번 사용 가능하다.
        Stream<Integer> stream = list.stream();
        // forEach() 메소드를 이용한 스트림 요소의 순차 접근
        stream.forEach(System.out::println);

        //새롭게 진행할때는 다시 선언
        Stream<Double> stream2 = Stream.of(4.2, 2.5, 3.1, 1.9);

        stream2.forEach(System.out::println);

        String[] arr = {"I study hard", "You study JAVA", "I am hungry"};

        Stream<String> stream3 = Arrays.stream(arr);
        stream3.flatMap(s -> Stream.of(s.split(" +"))).forEach(System.out::println);
    }
}
