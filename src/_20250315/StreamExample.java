package _20250315;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        //리스트 생성
        List<String> list = Arrays.asList("a","b","c","d");

        //스트림 생성 및 처리
        List<String> upperCaseList = list.stream() //스트림 생성
                .map(String::toUpperCase)          //각 요소를 대문자로 변환
                .collect(Collectors.toList());    //결과를 리스트로 수집

        //결과 출력
        upperCaseList.forEach(System.out::println);
    }
}

/*
코드 설명
1. 리스트 생성 Arrays.asList("a","b","c","d") 를 사용하여 문자열 리스트를 생성합니다
2. 스트림 생성 list.stream() 을 통해 리스트에서 스트림을 생성합니다
3. 중간 연산 map(String::toUpperCase)를 사용하여 각 요소를 대문자로 변환합니다
4. 최종 연상 collect(Collectors.toList()) 를 사용하여 스트림의 결과를 리스트로 수집
5. 결과 출력 forEach(System.out::println)  를 사용하여 변환된 리스트의 각 요소를 출력합니다
 */
