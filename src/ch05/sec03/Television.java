package ch05.sec03;

public class Television implements RemoteControl {

    private int volume;
    private int time;

    @Override
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Television 클래스의 인스턴스 메소드 추가 선언
    public void setTime(int time) {
        this.time = time;
    }

    public void record() {
        System.out.println("녹화를 시작합니다.");
    }
}
