package ch04.sec01;

import ch04.sec01.package2.Bus;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(10);
        car.setModel("현대");
        car.setColor("화이트");

        System.out.println(car.getSpeed());
        System.out.println(car.getModel());
        System.out.println(car.getColor());

        /// /// 메소드 오버라이딩 //////
        SportCar sportCar = new SportCar();
        sportCar.driveSportMode();
        sportCar.stop();

        Bus bus = new Bus();
        bus.driveBusMode();

        sportCar.driveMode();
        bus.driveMode();






    }
}
