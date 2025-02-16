package ch06.sec01.package3;

public class A {
    /*
    로컬 클래스
    생성자 또는 메소드 내부에서 선언된 클래스를 로컬 클래스(Local Class)라고 한다.
     */

    public A() {
        class B {

        }
        B b = new B();
    }

    void method() {
        class C {

        }
    }
}
