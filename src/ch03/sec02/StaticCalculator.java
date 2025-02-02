package ch03.sec02;

public class StaticCalculator {
    // pi 값을 정의 - 정적 필드
    //  정적 필드 선언시 초기화를 함께 해주는 것이 일반적이다.
    //
    static double pi = 3.141592;

    // 더하기 기능을 정의 - 정적 메소드
    static int plus(int a, int b) {
        return a + b;
    }
}
