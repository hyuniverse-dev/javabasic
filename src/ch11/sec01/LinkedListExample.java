package ch11.sec01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        /*
        LinkedList

        List 컬렉션의 종류 중 하나이다. ArrayList와 사용 방법은 동일하다. 하지만 내부 구조는 완전히 다르다.
        ArrayList 내부 배열에 객체를 직접 저장하지만 LinkedList는 인접 객체를 체인 형식으로 관리한다.

        따라서 빈번한 수정이 이뤄지는 리스트인 경우는 LinkedList를 사용하는 것이 효율적이다.
         */

        // ArrayList 객체 생성
        List<String> list1 = new LinkedList<>();

        // LinkedList 객체 생성
        List<String> list2 = new LinkedList<>();

        // 시작 시간과 끝 시간을 저장할 변수 선언
        long startTime;
        long endTime;

        // ArrayList 에 객체 추가 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린 시간 : " + (endTime - startTime) + "ns");

        // LinkedList 에 객체 추가 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린 시간 : " + (endTime - startTime) + "ns");

    }
}
