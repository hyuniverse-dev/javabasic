package ch04.sec04.package1;

public class FeaturePhone extends Phone {
    public FeaturePhone(String owner) {
        super(owner);
    }

    @Override
    public void turnOn() {
        System.out.println("피처폰을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("피처폰을 끕니다.");
    }
}
