package ch04.sec03.package2;

public class DriveExample {
    public static void main(String[] args) {
        // Driver 객체 생성
        Driver driver = new Driver();

        // 파라미터로 Bus 객체를 전달
        Bus bus = new Bus();
        driver.drive(bus);

        // 파라미터로 Taxi 객체를 전달
        Taxi taxi = new Taxi();
        driver.drive(taxi);


    }
}
