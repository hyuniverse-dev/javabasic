package ch05.sec02;

public class SmartTelevisionImpl implements RemoteControl2, Searchable {

    // RemoteControl2 의 메소드
    @Override
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    // RemoteControl2 의 메소드
    @Override
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

    // Searchable 의 메소드
    @Override
    public void search(String url) {
        System.out.println(url + "검색을 합니다.");
    }
}
