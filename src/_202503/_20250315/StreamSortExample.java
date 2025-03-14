package _202503._20250315;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortExample {
    public static void main(String[] args) {
        //리스트 생성
        List<String> list = Arrays.asList("banana","apple","grape","kiwi","orange");

        //스트림 생성 및 처리
        List<String> sortedList = list.stream()  //스트림 생성
                .sorted()                        //알파벳 순으로 정렬
                .collect(Collectors.toList());   //정렬된 결과를 리스트로 수집

        //결과 출력
        sortedList.forEach(System.out::println);
    }
}

/*
코드 설명
1.리스트 생성 : Arrays.asList() 를 사용하여 문자열 리스트를 생성.
2.스트림 생성 : list.stream() 을 통해 리스트에서 스트림을 생성.
3.중간 연산:
    sorted(): 스트림의 요소를 기본 정렬 순서(알파벳 순)로 정렬
4.최종 연산 collect(Collectors.toList()) 를 사용하여 정렬된 결과를 리스트로 수집.
5.결과 출력 : forEach(System.out::println)를 사용하여 정렬된 리스트의 각 요소를 출력합니다.
 */
