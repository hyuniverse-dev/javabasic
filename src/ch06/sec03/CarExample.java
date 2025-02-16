package ch06.sec03;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.run1();
        car.run2();
        car.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("미쉘린 타이어가 굴러갑니다.");
            }
        });
    }
}
