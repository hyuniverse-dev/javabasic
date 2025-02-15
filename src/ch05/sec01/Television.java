package ch05.sec01;

public class Television implements RemoteControl {

    /*
    인터페이스의 구현체는 implements 키워드를 사용한다.
    구현체(구현 객체)는 인터페이스에 선언된 turnOn() 추상메소드를 '반드시' 재정의 해야 한다.
     */

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

}
