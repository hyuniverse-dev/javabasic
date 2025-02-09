package ch04.sec02;

class ParentA {
    public String fieldA;

    public void methodA() {
        System.out.println("ParentA 클래스 메소드");
    }
}

class ChildB extends ParentA {
    public String fieldB;

    public void methodB() {
        System.out.println("ChildB 클래스 메소드");
    }
}

class ChildC extends ParentA {
    public String fieldC;
}

public class PromotionPracticeExample {
    public static void main(String[] args) {
        // 객체 생성
        //  - A 객체는 a1, B 객체는 b1, C 객체는 c1 대입

        //  - b1 객체의 methodB 호출

        //  - 프로모션 적용 (b1, c1을 부모 클래스 타입으로 적용)
    }
}
