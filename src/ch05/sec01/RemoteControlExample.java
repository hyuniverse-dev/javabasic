package ch05.sec01;

public class RemoteControlExample {
    public static void main(String[] args) {
        /*
        인터페이스는 직접 객체를 생성하지 않는다.
        주로 구현체를 인스턴스화 해서 인터페이스 타입의 변수에 대입하여 사용한다.

        인터페이스 타입의 변수에는 null 대입이 가능하다.

        인터페이스 변수를 통해 turnOn() 메소드가 호출되면, 실제로 실행되는 것은 Television 구현체에서
        재정의된 turnOn() 메소드가 호출되는 것이다.
         */

        RemoteControl rc;
        rc = null;
        rc = new Television();
        rc.turnOn();

        RemoteControl rc2 = new Television();
        rc2.turnOn();
    }
}
