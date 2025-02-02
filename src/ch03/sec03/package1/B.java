package ch03.sec03.package1;

class B {
    int numberB;
    private int numberB2;

    private double pi = 3.14;

    private void printB() {
        System.out.println("private 메소드");
    }

    private void printB2() {
        System.out.println("B클래스 내부에서만 사용되는 메소드");
    }

    public double getArea(int radius) {
        printB2(); // private 메소드 사용
        return pi * radius * radius; // private 필드 사용
    }
}
