package ch03.sec01;

public class CarExample {
    public static void main(String[] args) {
        // 자동차 객체 1개 생성
        Car car1 = new Car("소나타", 30, true);
        System.out.println(car1.model);

        // car1 객체의 model 필드 값 수정
        car1.model = "소나타";
        System.out.println(car1.model);

        // car1의 속도 데이터를 출력
        System.out.println(car1.speed);

        // car1 객체의 speed 값을 20으로 수정 후 출력
        car1.speed = 20;
        System.out.println(car1.speed);

        // car1의 운행 상태 데이터를 출력
        System.out.println(car1.isRunning);

        // car1의 운행 상태 데이터를 true로 수정 후 출력
        car1.isRunning = true;
        System.out.println(car1.isRunning);

        // car1의 시동 켜기
        car1.powerOn();

        // car1의 시동 끄기
        car1.powerOff();
    }
}
