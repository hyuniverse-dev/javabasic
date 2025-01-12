package ch01.sec06;

public class BreakContinueExample {
    public static void main(String[] args) {
        // break 연습문제
        //  for문에 카운터변수 i, j가 존재
        //  j의 값이 75일 때 반복문 실행 중단 후 i의 값을 확인
        for (int i = 1, j = 100; i <= 100 && j >= 1; i++, j--) {
            // j의 값이 75일 때 반복 중단 + i의 값을 출력하는 코드
            if (j == 75) {
                System.out.println("i = " + i);
                break;
            }
        }

        // continue 연습문제
        // for문에 3의 배수만 출력
        // 반복 범위는 1~100 사이
        for (int i = 1; i <= 100; i++) {
            // 3의 배수만 출력(continue 사용) 조건처리
            if (i % 3 != 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
