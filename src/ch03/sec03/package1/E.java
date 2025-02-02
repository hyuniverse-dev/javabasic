package ch03.sec03.package1;

public class E {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(); // b 인스턴스 생성 가능

        int numberA = a.numberA;
        int numberB = b.numberB;
//        b.numberB2; -> private 필드 호출 불가

        a.printA();
        a.printA2();

//        b.printB(); -> private 메소드 호출 불가


    }
}
