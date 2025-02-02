package ch03.sec03.package3;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car car = new Car();

        car.setSpeed(-100);
        double speed = car.getSpeed();
        System.out.println("speed = " + speed);

        car.setSpeed(80);
        speed = car.getSpeed();
        System.out.println("speed = " + speed);
    }
}
