package ch06.sec03;

public class HomeExample {
    public static void main(String[] args) {
        // Home 객체 생성
        Home home = new Home();

        // 익명 객체가 대입된 필드 사용
        home.use1();

        System.out.println("--------------------");

        // 익명 객체가 대입된 로컬 변수 사용
        home.use2();

        System.out.println("--------------------");

        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("SmartTv를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("SmartTv를 끕니다.");
            }
        });
    }
}
