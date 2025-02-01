package ch03.sec01;

// '자동차' 라는 객체를 정의한 클래스(설계도)
public class Car {
    // 1. 모델 데이터
    String model;

    // 2. 자동차 속도 데이터
    int speed;

    // 3. 운행 상태 데이터
    boolean isRunning;

    // 생성자 선언
    public Car(String model, int speed, boolean isRunning) {
        this.model = model;

        // 생성자를 통해 전달받은 speed 데이터를 대입
        this.speed = speed;

        // 생성자를 통해 전달받은 isRunning 데이터를 대입
        this.isRunning = isRunning;
    }

    // 메소드 정의
    void powerOn() {
        System.out.println("시동이 켜졌습니다.");
    }

    // powerOff 메소드를 정의하고, 호출 시 "시동이 꺼졌습니다." 출력
    void powerOff() {
        System.out.println("시동이 꺼졌습니다.");
    }


}
