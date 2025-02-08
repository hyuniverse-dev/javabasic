package ch04.sec01.package2;

import ch04.sec01.Car;

public class Bus extends Car {
    @Override
    public void driveMode() {
        System.out.println("시내 주행 모드");
    }

    public void driveBusMode() {
        System.out.println("시내 주행 모드");
    }
}
