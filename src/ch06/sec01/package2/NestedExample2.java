package ch06.sec01.package2;

public class NestedExample2 {
    /*
    정적 멤버 클래스의 접근 제한자에 따른 범위
    1. public static class B{}: 다른 패키지에서 B 클래스를 사용할 수 있다.
    2. static class B{}: 같은 패키지에서만 B 클래스를 사용할 수 있다.
    3. private class B{}: A 클래스 내부에서만 B 클래스 사용 가능하다.

    정적 멤버 클래스는 일반적으로 public 접근 제한자를 주로 사용한다.
     */
    public static void main(String[] args) {

        A.B b = new A.B();
        b.method3();
        A.B.method4();
    }
}
