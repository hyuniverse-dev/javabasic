package ch03.sec03;

public class Singleton {
    // 싱글톤 패턴
    //  - 클래스인데 애플리케이션 전체에서 단 한개의 객체만 생성하고 사용할 수 있다.
    //  - 앞에서 배웠던 Enum도 싱글톤 패턴
    //  - 핵심은 생성자를 private 접근자로 제한해서 외부에서 new 연산자를 호출할 수 없도록 막는 것이다.

    private static Singleton singleton = new Singleton();

    private static String data = "데이터"; // 필드 추가

    private Singleton() {
        // 외부에서 호출이 불가능
    }

    public static String getData() {
        return data;
    }

    // public 접근 권한을 갖는 정적 메소드 선언
    public static Singleton getInstance() {
        return singleton;
    }
}
