package ch01.sec06;

public class PrintFrom1To10Example {
    public static void main(String[] args) {
        // 반복문
        //  - 프로그램 코드를 작성하다보면 반복되는 코드가 발생 -> 해소하기 위해 사용하는 문법
        int sum = 0;
        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;
        sum = sum + 4;
        sum = sum + 5;
        System.out.println(sum);

        System.out.println("======");

        //  - 반복문을 사용해서 1부터 100까지 누적합 구하기
        sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        //  - 반복문을 사용해서 0부터 10까지 누적합 구하기
        sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        // 여러 개의 카운터 변수(로컬 변수) 사용하기
        for (int i = 0, j = 100; i <= 50 && j >= 50; i++, j--) {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }

        // 초기화식 주의할 점 - double, float
        //  - 부동 소수점은 정확도가 떨어지기 때문에 예측한 만큼 반복이 실행되지 않을 수 있다.
        int count = 0;
        for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
            System.out.println("x = " + x);
            count++;
        }
        System.out.println("count = " + count);









    }
}
