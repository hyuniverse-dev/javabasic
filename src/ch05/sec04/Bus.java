package ch05.sec04;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    // Bus 클래스의 인스턴스 메소드 선언
    public void checkPrice() {
        System.out.println("승차요금을 체크합니다.");
    }
}
