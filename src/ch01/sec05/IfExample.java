package ch01.sec05;

public class IfExample {
    public static void main(String[] args) {

        // 조건문 (if문)

        int score = 93;

        // 점수가 90점 이상이면 "A등급" 이라는 문자열을 출력
        if (score >= 90) {
            // 위의 조건식이 true인 경우 -> 코드 블록 실행
            System.out.println("A등급");
        }
    }
}
