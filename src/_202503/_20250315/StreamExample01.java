package _202503._20250315;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample01 {
    public static void main(String[] args) {
        //1.배열선언
        String[] arr = {"apple", "banana", "cherry", "date"};

        //2.배열을 스트림으로 변환
        Stream<String> stream = Arrays.stream(arr);

        //3.스트림을 사용하여 배열 요소 출력
        stream.forEach(System.out::println);
    }
}
