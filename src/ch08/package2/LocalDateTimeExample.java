package ch08.package2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        /*
        LocalDateTime 클래스
        Date 와 Calendar 클래스는 시간 데이터를 얻거나 포맷팅하여 사용할 수는 있다.
        날짜/시간 데이터를 조작할 수가 없다. java.time 패키지 안에 있는 모듈이다.
         */

        // 현재 시간 객체 생성
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        // LocalDateTime 으로 얻은 시간 데이터 형식 지정
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
        String nowStr = now.format(pattern);
        System.out.println("nowStr = " + nowStr);

        // 연도 더하기
        LocalDateTime result1 = now.plusYears(1);
        System.out.println("result1 = " + result1);

        // 월 더하기
        LocalDateTime result2 = now.plusMonths(2);
        System.out.println("result2 = " + result2);

        // 일 더하기
        LocalDateTime result3 = now.plusDays(1);
        System.out.println("result3 = " + result3);

        // 날짜와 시간 비교하는 메소드
        LocalDateTime target = LocalDateTime.of(2025, 2, 23, 11, 00, 00);

        boolean isBefore = now.isBefore(target);
        System.out.println("isBefore = " + isBefore);

        boolean isAfter = now.isAfter(target);
        System.out.println("isAfter = " + isAfter);

        if (isBefore) {
            System.out.println("예약 시간 전 입니다.");
        } else {
            System.out.println("예약 시간 초과입니다.");
        }


    }
}
