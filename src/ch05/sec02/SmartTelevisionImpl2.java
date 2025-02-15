package ch05.sec02;

public class SmartTelevisionImpl2 implements SmartTelevision {
    @Override
    public void turnOn() {
        System.out.println("SmartTelevision 인터페이스 상속한 turnOn()");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTelevision 인터페이스 상속한 turnOff()");
    }

    @Override
    public void search(String url) {
        System.out.println("SmartTelevision 인터페이스 상속한 search() : " + url);
    }
}
