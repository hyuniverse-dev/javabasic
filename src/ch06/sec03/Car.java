package ch06.sec03;

public class Car {
    // 필드에 Tire 객체 대입
    private Tire tire1 = new Tire();
    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("한국 타이어가 굴러갑니다.");
        }
    };

    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    public void run2() {
        // 로컬 변수에 익명 객체 대입
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("금호 타이거가 굴러갑니다.");
            }
        };
        tire.roll();
    }

    public void run3(Tire tire) {
        tire.roll();
    }
}
