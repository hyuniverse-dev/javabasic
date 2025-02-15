package ch05.sec03;

public class PromotionExample {
    public static void main(String[] args) {
        /*
        B, C, D, E 로부터 생성된 객체는 모두 A 인터페이스로 자동 형변환(Promotion)
        가능하다. 이유는 모두 인터페이스 A를 직/간접적으로 구현하고 있기 때문이다.
         */
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // A 인터페이스 변수 선언
        A a;
        a = b;
        a = c;
        a = d;
        a = e;
    }
}
