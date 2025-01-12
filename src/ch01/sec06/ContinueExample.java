package ch01.sec06;

public class ContinueExample {
    public static void main(String[] args) {
        // continue
        //  - 1회차만 스킵하는 명령어
        //  - continue 하위 코드만 스킵(continue 이전은 실행)

        for (int i = 1; i <= 10; i++) {
            // 출력(짝수만)
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
