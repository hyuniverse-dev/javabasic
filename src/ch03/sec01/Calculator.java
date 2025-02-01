package ch03.sec01;

public class Calculator {
    // (1) 두 정수를 더한 결과를 반환하는 메소드
    int plus(int a, int b) {
        int result = a + b;
        return result;
    }

    // (2) 두 정수를 나눈 결과를 반환하는 메소드
    double divide(int a, int b) {
        double result = 0;
        if (b != 0) {
            result = (double) a / (double) b;
        }
        return result;
    }

    // (3) 두 정수의 평균을 구하는 메소드
    double average(int a, int b) {
//        int sum = a + b;
        double result = (double) plus(a, b) / 2;
        return result;
    }


}
