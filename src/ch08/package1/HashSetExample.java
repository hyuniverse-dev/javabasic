package ch08.package1;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        /*
        Object 의 equals() 메소드 혹은 hashCode() 메소드를 재정의하는 이유는
        중복 객체를 처리하기 위한 방법으로 사용된다.

        HashSet 이라고 하는 컬렉션에서 동등 객체는 중복 저장하지 않도록 처리하기 위해서
        hashCode() 와 equals() 를 재정의 한다.

        HashSet 컬렉션의 특징은 '중복을 허용하지 않는다' 입니다.
         */

        HashSet hashSet = new HashSet<>();

        Student s1 = new Student(1, "홍길동");
        hashSet.add(s1);
        System.out.println("저장된 학생의 수 = " + hashSet.size());

        Student s2 = new Student(1, "홍길동");
        hashSet.add(s2);
        System.out.println("저장된 학생의 수 = " + hashSet.size());

        Student s3 = new Student(1, "김길동");
        hashSet.add(s3);
        System.out.println("저장된 학생의 수 = " + hashSet.size());
    }
}
