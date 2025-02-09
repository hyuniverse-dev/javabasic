package ch04.sec02;

class ParentA {
    public String fieldA;

    public void methodA() {
        System.out.println("ParentA 클래스 메소드");
    }
}

class ChildB extends ParentA {
    public String fieldB;

    public void methodB() {
        System.out.println("ChildB 클래스 메소드");
    }
}

class ChildC extends ParentA {
    public String fieldC;
}

public class PromotionPracticeExample {
    public static void main(String[] args) {
        // 객체 생성
        //  - A 객체는 a1, B 객체는 b1, C 객체는 c1 대입
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();

        //  - b1 객체의 methodB 호출
        b1.methodB();

        //  - 프로모션 적용 (b1, c1을 부모 클래스 타입으로 적용)
        A a2 = b1;
        A a3 = c1;

        //  - a2 객체의 methodB 호출
        // a2.methodB(); -> 호출불가

        //  - a2 객체의 methodB 호출을 위한 타입캐스팅
        B b2 = (B) a2;
        b2.methodB();
    }
}
