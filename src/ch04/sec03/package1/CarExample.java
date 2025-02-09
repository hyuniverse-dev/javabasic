package ch04.sec03.package1;

public class CarExample {
    public static void main(String[] args) {
        // 객체 생성
        Car car = new Car();

        // Tire 장착 - 타이어 객체를 생성해서 장착하지 않으면 NullPointerException 발생
        Tire tire = new Tire();
        car.tire = tire;
        car.run();

        // 한국 타이어로 장착
        HankookTire hankookTire = new HankookTire();
        car.tire = hankookTire;
        car.run();

        // 금호 타이어로 장착
        KumhoTire kumhoTire = new KumhoTire();
        car.tire = kumhoTire;
        car.run();

        // 넥센(Nexen) 타이어 객체를 생성해서 자동차에 장착하고 run() 메소드 호출
        NexenTire nexenTire = new NexenTire();
        car.tire = nexenTire;
        car.run();
    }
}
