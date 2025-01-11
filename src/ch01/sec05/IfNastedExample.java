package ch01.sec05;

public class IfNastedExample {
    public static void main(String[] args) {
        // 중첩 if문
        //  if문 안에 또 다른 if문 존재

        int score = 80;
        boolean isMan = false;

        if (score >= 90) {
            // 남학생이면 "남자 학생 중 최고등급 입니다." 출력
            if (isMan) {
                System.out.println("남자 학생 중 최고등급 입니다.");
            } else {
                System.out.println("여자 학생 중 최고등급 입니다.");
            }
            System.out.println("A등급 입니다.");
        } else if (score >= 80) {
            System.out.println("B등급 입니다.");
        } else {
            System.out.println("C등급 입니다.");
        }

        //////////// 연습 문제 ////////////
        //  (1) score 변수에 96점 대입
        score = 96;
        if (score >= 90) {
            //  (2) 조건처리1 - 90점 이상이면 "A 등급입니다." 출력, 그런데 95점 이상이면 "A+ 등급입니다." 출력.
            System.out.println("장학금 대상입니다.");
            if (score >= 95) {
                System.out.println("A+등급 입니다.");
            } else {
                System.out.println("A등급 입니다.");
            }
        } else {
            //  (3) 조건처리2 - 그 외에는 모두 "B 등급입니다" 출력.
            System.out.println("B등급 입니다.");
        }
    }
}
