package ch01.sec05;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        // switch~case문
        System.out.print("문자열을 입력하세요 >>> ");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();

        switch (message) {
            case "Bye":
                System.out.println("잘가세요.");
                break;
            case "Welcome":
                System.out.println("환영합니다.");
                break;
            case "Hello":
                System.out.println("안녕하세요.");
                break;
            default:
                System.out.println("번역이 불가능한 단어입니다.");
        }

        // switch문 안의 변수
        //  byte, char, short, int, long, String 타입의 변수만 사용이 가능합니다.
        //  boolean 불가능합니다.
        /* 컴파일 에러 발생
        boolean isTrue = true;
        switch (isTrue) {
            
        }
         */

        // switch문 응용
        char grade = 'b';

        switch (grade) {
            case 'a':
            case 'A':
                System.out.println("A등급 입니다.");
                break;
            case 'b':
            case 'B':
                System.out.println("B등급 입니다.");
                break;
            case 'c':
            case 'C':
                System.out.println("C등급 입니다.");
                break;
        }

        //////////// 연습 문제 ////////////
        //  사용자로부터 1~12월 중 하나를 입력받아 해당 월이 몇 일까지 존재하는지 출력
        System.out.print("월을 입력하세요 >>> ");
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();

        // 입력받은 month의 값을 범위로 조건처리 하기 위해서 정수형으로 타입캐스팅
        int monthInt = Integer.parseInt(month);

        // 만약 1~12월이 아닌 문자열을 입력하면 "존재하지 않는 월 입니다." 출력
        if (monthInt >= 1 && monthInt <= 12) {
            // switch~case 문으로 분기처리
            switch (month) {
                case "1", "3", "5", "7", "8", "10", "12":
                    System.out.println("마지막 날짜는 31일 입니다.");
                    break;
                case "4", "6", "9", "11":
                    System.out.println("마지막 날짜는 30일 입니다.");
                    break;
                default:
                    System.out.println("마지막 날짜는 28일 또는 29일 입니다.");
            }
        } else {
            System.out.println("존재하지 않는 월 입니다.");
        }

        // 범위 조건식 만들기
        int number = 5;
        //  (1) 1이상이고 10이하의 정수인 경우만 "실행됐습니다." 출력
        if (number >= 1 && number <= 10) {
            System.out.println("실행됐습니다.");
        }

        //  (2) 1미만이거나 10초과인 경우만 "실행됐습니다." 출력
        if (number < 1 || number > 10) {
            System.out.println("실행됐습니다.");
        }
    }
}








