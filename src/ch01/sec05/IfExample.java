package ch01.sec05;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {

        // 조건문 (if문)

        int score = 80;

        // 점수가 90점 이상이면 "A등급" 이라는 문자열을 출력
        if (score >= 90) {
            // 위의 조건식이 true인 경우 -> 코드 블록 실행
            System.out.println("A등급");
        } else {
            // 조건문 (if~else문)
            // 점수가 90점 미만이면 "B등급" 이라는 문자열 출력
            // if (score < 90) {
            //    System.out.println("B등급");
            // }
            System.out.println("B등급");
        }

        // 다중 조건 처리
        score = 85;

        if (score >= 90) {
            System.out.println("A등급 입니다.");
        } else if (score >= 80) {
            System.out.println("B등급 입니다.");
        } else if (score >= 70) {
            System.out.println("C등급 입니다.");
        } else {
            System.out.println("D등급 입니다.");
        }

        // 위 코드와 동일한 조건이지만, 순서의 문제로 인해 다른 결과를 출력한다.
        if (score >= 70) {
            System.out.println("C등급 입니다.");
        } else if (score >= 80) {
            System.out.println("B등급 입니다.");
        } else if (score >= 90) {
            System.out.println("A등급 입니다.");
        } else {
            System.out.println("D등급 입니다.");
        }

        //////////// 연습 문제 ////////////
        //  문자열 비교: == -> .equals()
        //           : 문자열 타입은 기본 자료형이 아니기 때문에 동등연산자(==) 다른 결과를 반환할 때가 있기 때문에
        //           : 그래서 .equals() 메소드를 사용해야 한다.

        System.out.print("문자열을 입력하세요 >>> ");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();

        message = message.equals("") ? null : message; // message의 값이 빈 문자열이면 null 반환

        // .equals() 메소드(기능)를 사용할 때는 고정된 값을 기준으로 한다.
        if ("Bye".equals(message)) {
            // 조건(1) message의 문자열이 "Bye" 이면 한국어로 "잘가세요." 로 번역(출력)
            System.out.println("잘가세요.");
        } else if ("Welcome".equals(message)) {
            // 조건(2) message의 문자열이 "Welcome" 이면 한국어로 "환영합니다." 로 번역(출력)
            System.out.println("환영합니다.");
        } else if ("Hello".equals(message)) {
            // 조건(3) message의 문자열이 "Hello" 이면 한국어로 "안녕하세요." 로 번역(출력)
            System.out.println("안녕하세요.");
        }
    }
}








