package ch04.sec04.package1;

public class SmartPhone extends Phone {
    public SmartPhone(String owner) {
        super(owner);
    }

    @Override
    public void turnOn() {
        System.out.println("스마트폰을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트폰을 끕니다.");
    }

    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
