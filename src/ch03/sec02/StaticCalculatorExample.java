package ch03.sec02;

public class StaticCalculatorExample {
    public static void main(String[] args) {
        // 계산기 프로그램에서 사용하는 계산기 객체
        System.out.println(StaticCalculator.pi);

        int result = StaticCalculator.plus(5, 10);
        System.out.println("result = " + result);
    }
}
