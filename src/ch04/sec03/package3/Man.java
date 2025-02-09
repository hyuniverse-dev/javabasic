package ch04.sec03.package3;

public class Man extends Person {
    // go() 메소드를 재정의하여 "남자 화장실을 갑니다."
    @Override
    public void go() {
        System.out.println("남자 화장실을 갑니다.");
    }
}
