package ch04.sec03.package2;

public class Bus extends Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    public void charge() {
        System.out.println("버스 요금을 냅니다.");
    }
}
