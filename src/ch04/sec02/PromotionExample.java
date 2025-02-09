package ch04.sec02;

class A {

    public String fieldA;

    public void methodA() {
        System.out.println("A 메소드");
    }
}

class B extends A {

    public String fieldB;

    @Override
    public void methodA() {
        System.out.println("오버라이딩된 B 메소드");
    }

    public void methodB() {
        System.out.println("B 메소드");
    }
}

class C extends A {

}

class D extends B {

}

class E extends C {

}

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B(); // A 클래스 상속
        C c = new C(); // A 클래스 상속
        D d = new D(); // B 클래스 상속
        E e = new E(); // C 클래스 상속

        // Promotion 적용 이전
        b.methodB(); // 호출 가능
        String fieldB = b.fieldB; // 접근 가능

        ///////////// Promotion 적용 범위 알아보기
        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        // Promotion 적용 이후
//        a1.methodB(); -> 호출 불가
//        a1.fieldB; -> 접근 불가
        a1.methodA(); // 오버라이딩된 메소드는 해당 메소드를 호출한다.

        B b1 = d;
        C c1 = e;

        // 불가능 -> 컴파일 에러 발생
//        B b2 = e;
//        C c2 = b;

        // 부모 클래스에 정의된 메소드가 상속
        b.methodA();
        c.methodA();
        d.methodA();
        e.methodA();

        ///////////// 타입 캐스팅 (프로모션이 적용된 부모 타입 -> 원래의 자식 타입)
        B b2 = (B) a1;
        C c2 = (C) a2;
        D d2 = (D) a3;
        E e2 = (E) a4;

        String fieldB1 = b2.fieldB; // 접근 가능
        b2.methodB(); // 호출 가능
    }
}








