package ch04.sec04.package1;

public class PhoneExample {
    public static void main(String[] args) {
//        Phone owner = new Phone("박현"); -> 추상클래스, 컴파일 에러
        SmartPhone smartPhone = new SmartPhone("박현");
        smartPhone.turnOn();
        smartPhone.turnOff();

        turnOn(new SmartPhone("박현"));
        turnOn(new FeaturePhone("박현"));
    }

    public static void turnOn(Phone phone) {
        phone.turnOn();
    }
}
