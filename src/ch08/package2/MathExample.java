package ch08.package2;

public class MathExample {
    public static void main(String[] args) {
        /*
        Math 클래스는 수학 계산에 사용할 수 있는 메소드를 제공합니다.
        Math 클래스의 모든 메소드는 정적 메소드(static) -> 인스턴스가 필요없다.
         */

        // 큰 정수 또는 작은 정수 얻기
        double value1 = Math.ceil(5.3); // 올림 처리
        System.out.println("value1 = " + value1);

        double value2 = Math.floor(5.3);// 내림(버림) 처리
        System.out.println("value2 = " + value2);

        // 큰 값 또는 작은 값 얻기
        int value3 = Math.max(10, 20);
        System.out.println("value3 = " + value3);

        int value4 = Math.min(10, 20);
        System.out.println("value4 = " + value4);

        findMaxNumber(-10, -20, -30, -40); // Math 클래스의 정적 메소드를 활용한 메소드

        // 소수점 이하 두 자리 얻기
        double value5 = 12.6456;
        value5 = value5 * 100;
        value5 = Math.round(value5);
        double value6 = value5 / 100.0;
        System.out.println("value6 = " + value6);

    }

    public static void findMaxNumber(int... numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            max = Math.max(max, number);
        }
        System.out.println("max = " + max);
    }
}
