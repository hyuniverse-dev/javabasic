package ch06.sec01.package1;

public class NestedClassExample {
    /*
    중첩 클래스(Nested Class)
    특정 클래스만 관계를 맺을 경우에는 중첩 클래스로 선언한다. 오히려 유지보수에 도움된다.
    예를 들면 Tire, Engine 클래스가 Car 에서만 사용이 된다면 중첩 클래스로 선언하는 것이 유리하다.

    중첩 클래스 종류 - 선언되는 위치에 따라 다르다.
    1. 멤버 클래스(인스턴스 클래스): A객체를 생성해야만 중첩된 B객체를 생성할 수 있다.
    2. 멤버 클래스(정적 클래스): A객체를 생성하지 않아도 B객체를 생성할 수 있다.
    3. 로컬 클래스: method()가 실행될 때만 B 객체를 생성할 수 있다.

    중첩 클래스 특징
    1. 중첩된 클래스도 하나의 클래스이기 때문에 컴파일 하면 .class 파일이 별도로 생성된다.
    2. A    $   B.class
     (바깥)   (중첩)
     */
    public static void main(String[] args) {
        // A 객체 생성
        A a = new A();

        System.out.println("--------------");
        System.out.println(a);
        System.out.println("--------------");

        System.out.println("--------------");
        a.method1();
        System.out.println("--------------");

        // 중첩된 클래스 B 객체 생성
        A.B b = a.new B(); // new B(); 로 생성할 수 없다. 생성된 A 인스턴스의 변수를 통해서 B 인스턴스를 생성한다.
        System.out.println("--------------");
        System.out.println(b);
        System.out.println("--------------");

    }
}
