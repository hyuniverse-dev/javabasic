package ch04.sec04.package2;

public class Dog extends Animal {
    // 추상클래스 Animal의 sound() 추상메소드 재정의

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
