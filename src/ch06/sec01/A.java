package ch06.sec01;

public class A {

    // 중첩된 B 클래스 필드에 대입
    B field = new B();

    public A() {
        // A 클래스 생성자 내부에서 사용
        B b = new B();
    }

    public void method1() {
        // A 클래스 메소드 내부에서 사용
        B b = new B();
        System.out.println(b.field2); // 인스턴스 멤버 필드
        System.out.println(B.field3); // 정적 멤버 필드

        b.method1(); // 인스턴스 메소드
        B.method2(); // 정적 메소드
    }

    // 인스턴스 멤버 클래스
    class B {
        /*
        접근 제한자에 따른 범위
        1. public: 다른 패키지에서 B클래스를 사용할 수 있다.
        2. default: 같은 패키지 안에서만 B클래스를 사용할 수 있다.
        3. private: A 클래스 내부에서만 B 클래스를 사용할 수 있다.
         
         중첩 클래스의 멤버
         1. 인스턴스 필드
         2. 인스턴스 메소드
         3. 생성자
         4. 정적 필드 (Java17+)
         5. 정적 메소드 (Java17+)
         */
        int field2 = 1;
        static int field3 = 2;

        public B() {
            System.out.println("B 클래스 생성자");
        }

        void method1() {
            System.out.println("B 클래스 인스턴스 메소드");
        }

        static void method2() {
            System.out.println("B 클래스 정적 메소드");
        }

    }
}
