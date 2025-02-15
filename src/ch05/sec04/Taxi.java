package ch05.sec04;

public class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }

    // setBasicPrice() 메소드를 선언
    // "기본요금을 적용합니다." 출력
    public void setBasicPrice() {
        System.out.println("기본요금을 적용합니다.");
    }
}
