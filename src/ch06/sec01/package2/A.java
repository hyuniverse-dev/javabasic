package ch06.sec01.package2;

public class A {


    // 정적 필드에 대입
    static B field1 = new B();

    // 인스턴스 필드에 대입
    B field2 = new B();

    // 생성자
    public A() {
        B b = new B();
    }

    // 인스턴스 메소드
    void method() {
        B b = new B();
    }

    // 정적 메소드
    static void method2() {
        B b = new B();
    }

    // 정적 멤버 클래스
    public static class B {
        /*
        중첩 클래스의 멤버
         1. 인스턴스 필드
         2. 인스턴스 메소드
         3. 생성자
         4. 정적 필드 (Java17+)
         5. 정적 메소드 (Java17+)
         */
        void method3() {
            System.out.println("B 정적 클래스의 인스턴스 메소드");
        }

        static void method4() {
            System.out.println("B 정적 클래스의 정적 메소드");
        }
    }
}
