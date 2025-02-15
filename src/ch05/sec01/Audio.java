package ch05.sec01;

public class Audio implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_INT) {
            this.volume = RemoteControl.MAX_INT;
        } else if (volume < RemoteControl.MIN_INT) {
            this.volume = RemoteControl.MIN_INT;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
}
