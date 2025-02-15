package ch05.sec04;

public class CarExample {
    public static void main(String[] args) {
        /*
        상속의 다형성과 마찬가지로 메소드 오버라이딩(재정의) + 자동 형변환(Promotion) 기능이 조합된 것이다.
         */

        // 자동차 객체 생성
        Car car = new Car();

        // 자동차가 달림
        car.run();

        System.out.println();

        car.tire1 = new KumhoTire();
        car.tire2 = new KumhoTire();

        car.run();
    }
}
