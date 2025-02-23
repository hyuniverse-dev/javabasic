package ch11.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        /*
        HashSet

        Set 컬렉션의 대표적인 구현체이다. List 컬렉션과 비슷하지만 다음과 같은 차이점이 존재한다.

            1. 순서가 없다.
            2. 중복을 허용하지 않는다.

        동일한 값을 저장하지 않는다. 구슬주머니에 비유하기도 한다.
         */

        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Database");
        set.add("Java");

        // 객체의 수 확인
        int size = set.size();
        System.out.println("size = " + size);

        // 현재 Set의 객체 출력
        for (String item : set) {
            System.out.println(item);
        }

        System.out.println();

        // 특정 객체를 찾는 방법 - 내부 반복자 iterator() 사용 (순서가 없기 때문에)
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next(); // 내부 반복자가 Set 에 저장되어 있는 객체를 찾아온다.
            System.out.println("element = " + element);

            // 가져온 객체를 컬렉션에서 제거
            if (element.equals("JDBC")) {
                iterator.remove();
            }

        }

        System.out.println();

        for (String item : set) {
            System.out.println(item);
        }
    }
}
