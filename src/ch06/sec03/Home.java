package ch06.sec03;

public class Home {
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV 전원을 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV 전원을 끕니다.");
        }
    };

    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    public void use2() {
        // 로컬 변수에 익명 구현체를 대입하여 "Audio를 켭니다." "Audio를 끕니다." 완성
        RemoteControl rc = new RemoteControl() {


            @Override
            public void turnOn() {
                System.out.println("Audio를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("Audio를 끕니다.");
            }
        };

        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
