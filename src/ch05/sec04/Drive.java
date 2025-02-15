package ch05.sec04;

public class Drive {

    void drive(Vehicle vehicle) {
        /*
        1. vehicle 매개변수에는 Vehicle 인터페이스의 구현체는 모두 올 수 있다.
        2. run() 메소드는 해당 구현체의 run() 메소드를 호출한다.
         */

        // Bus 인스턴스인지 확인하고, 맞으면 12, 13라인 실행
        Bus bus = (Bus) vehicle;
        bus.checkPrice();
        vehicle.run();
    }

}
