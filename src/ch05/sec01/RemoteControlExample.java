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
        rc2.setVolume(100);
        int volume = rc2.getVolume();
        System.out.println("티비 볼륨 = " + volume);
        rc2.setMute(true);
        rc2.setMute(false);
        rc2.turnOff();

        RemoteControl.changeBattery();
        System.out.println("-----------------------------------");
        /*
        인터페이스 변수에 Audio 구현체를 대입(구현체 교체)

        인터페이스 변수를 통해 turnOn() 메소드가 호출되면, 실제로 실행되는 것은 Audio 구현체에서
        재정의된 turnOn() 메소드가 호출되는 것이다.
         */
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(-10);
        volume = rc.getVolume();
        System.out.println("오디오 볼륨 = " + volume);
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();

        /*
        public 상수 호출
         */
        int maxInt = rc.MAX_INT;
        System.out.println("maxInt = " + maxInt);

        int minInt = rc.MIN_INT;
        System.out.println("minInt = " + minInt);
    }
}
