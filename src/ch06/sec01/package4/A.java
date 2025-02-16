package ch06.sec01.package4;

public class A {
    /*
    중첩 클래스의 바깥 멤버 접근
    기본적으로 중첩 클래스는 바깥 클래스랑 긴밀한 관계가 존재한다. 따라서 접근 할 수 있는데
    '중첩 클래스'가 어떻게 선언되어 있는지에 따라 접근에 제한이 있을 수 있다.

     1. 인스턴스 멤버 클래스: 바깥 클래스의 모든 필드와 메소드에 접근 가능하다.
     2. 정적 멤버 클래스: 바깥 클래스의 정적 필드와 정적 메소드만 접근 가능하다.
                     : 정적 멤버 클래스는 바깥 객체가 없어도 사용하기 때문에 바깥 클래스의 인스턴스 멤버가
                       존재하면 안된다.
     */

    // A의 인스턴스 필드와 메소드 선언
    int field1;

    void method1() {

    }

    // A의 정적 필드와 메소드 선언
    static int field2;

    static void method2() {

    }

    // 인스턴스 멤버 클래스
    class B {

        private String message = "";

        void method3() {
            // A의 인스턴스 필드와 메소드 사용
            // field1 은 실제로는 A.this 가 생략된 상태와 동일하다.
            // 현재 위치에서 this는 class B의 인스턴스를 지칭한다.

            A.this.field1 = 10;
            this.message = "";
            method1();

            field2 = 20;
            method2();
        }
    }

    // 정적 멤버 클래스
    static class C {
        void method4() {
            // A의 정적 필드와 메소드 사용
            field2 = 20;
            method2();
        }
    }

}
