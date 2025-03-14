package _202503._20250315;

import java.util.Arrays;
import java.util.List;

public class StreamFilterExample {
    public static void main(String[] args){
        //리스트 생성
        List<String>list = Arrays.asList("apple","banana","kiwi","grape","orabge");

        //스트림 생성 및 처리
        list.stream()   //스트림 생성
                .filter(s ->s.length() >= 5)   //길이가 5이상인 요소만 필터링
                .map(String::length)                 //각 요소의 길이를 추출
                .forEach(System.out::println);       //길이 출력
    }
}

/*
리스트 생성 : Arrays.asList()를 사용하여 문자열 리스트를 생성합니다
스트림 생성 : list.stream() 을 통해 리스트에서 스트림을 생성합니다
중간 연산:
filter(s -> s.length() >= 5)    문자열의 길이가 5이상인 요소만 필터링 합니다
map(String::length) 필터링된 각 요소의 길이를 추출합니다
forEach(System.out::println)  를 사용하여 각 요소의 길이를 출력합니다
 */