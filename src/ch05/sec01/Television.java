package ch05.sec01;

public class Television implements RemoteControl {

    private int volume;

    /*
    인터페이스의 구현체는 implements 키워드를 사용한다.
    구현체(구현 객체)는 인터페이스에 선언된 turnOn() 추상메소드를 '반드시' 재정의 해야 한다.
     */

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_INT) {
            // 최대값 보다 큰 값이 전달된 경우 MAX_INT 대입
            this.volume = RemoteControl.MAX_INT;
        } else if (volume < RemoteControl.MIN_INT) {
            // 최소값 보다 작은 값이 전달된 경우 MIN_INT 대입
            this.volume = RemoteControl.MIN_INT;
        } else {
            // 그 외에는 전달된 값 그대로 대입
            this.volume = volume;
        }

        System.out.println("현재 TV 볼륨 : " + this.volume);
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

}
