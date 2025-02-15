package ch05.sec01;

import java.rmi.Remote;

public interface RemoteControl {
    /*
    인터페이스는 접속기이다. (본체 <-> 단자 <-> 모니터)
    물리적인 형태는 *.java 형태의 소스 파일로 작성되고 *.class 형태로 컴파일 된다. (클래스랑 동일하다.)
    class 키워드 대신 interface 키워드 사용한다.
    사용 가능한 접근 제한자는 default, public 만 사용이 가능하다.
     */

    /*
    인터페이스 멤버로 올 수 있는 종류는 다음과 같다.
    1. public 상수 필드: 불변의 특성을 갖는 필드
    2. public 추상 메소드: 추상 메소드란 선언부(메소드 시그니처)만 있고, 구현부(실행부)인 중괄호가 없는 메소드이다.
    3. public 디폴트 메소드: 완전한 실행코드를 가진 메소드이다. 구현체 모두 공통으로 사용할 수 있는 메소드이다.
    4. public 정적 메소드: 추상 메소드와 디폴트 메소드는 호출하려면 구현체가 필요하지만
                         정적 메소드는 구현체가 없어도 인터페이스 만으로 호출 가능하다.
                         선언 방법은 클래스의 정적 메소드 선언과 완전히 동일하다.
    5. private 메소드: 구현체가 필요한 메소드 - 외부에서 접근 불가하다.
    6. private 정적 메소드: 구현체가 필요하지 않은 메소드 - 외부에서 접근 불가하다.

    인터페이스 멤버에서 주로 사용되는 멤버들은
    1. 상수 필드, 2. 추상 메소드, 3. 디폴트 메소드 정도이다.
     */
    public static final int MAX_INT = 10; // public 상수 필드
    public static final int MIN_INT = 0; // public 상수 필드

    void turnOn(); // 추상 메소드

    void turnOff(); // 추상 메소드

    void setVolume(int volume); // 추상 메소드

    int getVolume(); // 추상 메소드

    // 디폴트 메소드
    default void setMute(boolean mute) {

        if (mute) {
            defaultMessage();
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    // 정적 메소드
    static void changeBattery() {
        /*
         정적 메소드 선언 시 주의할 점
         정적 메소드 내부에는 상수 필드를 제외한
         1. 추상 메소드, 2. 디폴트 메소드, 3. private 메소드 등은 호출 불가하다.
         */
        int minInt = RemoteControl.MIN_INT; // 상수 필드
        defaultMessage2();
        System.out.println("건전지를 교환합니다.");
    }

    private void defaultMessage() {
        /*
        private 메소드는 인터페이스에 선언된 디폴트 메소드들에서
        공통으로 사용되는 부분을 추출하여 사용할 때 주로 생성합니다.
         */
        System.out.println("무음 처리 10분 후 자동 종료됩니다.");
    }

    private static void defaultMessage2() {
        /*
        private static 메소드는 인터페이스에 선언된 정적 메소드들에서
        공통으로 사용되는 부분을 추출하여 사용할 때 주로 생성합니다.
         */
        System.out.println("건전지를 분리합니다.");
    }
}
