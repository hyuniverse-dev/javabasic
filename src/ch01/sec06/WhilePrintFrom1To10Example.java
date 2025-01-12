package ch01.sec06;

public class WhilePrintFrom1To10Example {
    public static void main(String[] args) {
        // while문
        //  - for문은 정해진 횟수만큼 반복시킨다. while문은 특정 조건이 만족할 때만 반복을 시킨다.
        //  - 로또 번호 추첨
        //      - 1~45의 숫자 중 6개의 숫자를 추출 (조건: 중복되는 숫자는 허용하지 않는다.)

        //  - while 반복문을 사용해서 1부터 100까지 누적합 구하기
        int i = 1;
        int sum = 0;
        while (/*조건식*/ i <= 100) {
            sum = sum + i; // 누적합
            i++; // 조건식에 사용되는 변수의 값 변화
        }
        System.out.println(sum);

        // 연습 문제
        //  - j 변수를 초기화
        //  - multi 변수 1로 초기화
        //  - while문을 사용해서 1부터 20까지 누적곱을 계산
        //  - 누적곱 출력
        long j = 21;
        long multi = 1;
        while (j <= 20) {
            multi = multi * j;
            j++;
        }
        System.out.println("multi = " + multi);
    }
}
