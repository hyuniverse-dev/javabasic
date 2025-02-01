package ch03.sec01;

public class CalculatorExample {
    public static void main(String[] args) {
        // Calculator 객체 생성
        Calculator calculator = new Calculator();

        // plus 메소드 호출
        int resultA = calculator.plus(10, 20);
        System.out.println("resultA = " + resultA);

        // divide 메소드 호출
        double resultB = calculator.divide(20, 0);
        System.out.println("resultB = " + resultB);

        // average 메소드 호출
        double resultC = calculator.average(10, 20);
        System.out.println("resultC = " + resultC);
    }
}
