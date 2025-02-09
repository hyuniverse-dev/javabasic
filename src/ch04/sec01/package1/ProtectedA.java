package ch04.sec01.package1;

public class ProtectedA {
    // 필드 선언
    protected String field;

    // 생성자
    protected ProtectedA() {

    }
    
    protected ProtectedA(String field) {
        this.field = field;
    }

    // 메소드
    protected void method() {
        System.out.println("protected 메소드 호출");
    }
}
