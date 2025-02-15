package ch05.sec03;

public class CastingExample {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.turnOff();

        // Television 구현체에 선언한 메소드를 사용하기 위해 타입 캐스팅
        Television tv = (Television) rc;
        tv.record();
        tv.setTime(10);
    }
}
