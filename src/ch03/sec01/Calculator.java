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

    /// // 메소드 응용 - 가변 매개변수 사용 /////
    int plusAll(int... numbers) {
        int sum = 0;

        // 방법1 - 기본 반복문
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }

        // 방법2 - 향상된 for문
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    // 여러 개의 정수를 입력받아 평균을 반환하는 메소드 정의
    double averageAll(int... numbers) {
        // 전달받은 numbers의 총합 구하기
        int sum = plusAll(numbers);

        // 총합 / numbers의 길이로 나눈 결과를 반환
        return (double) sum / numbers.length;
    }


}
