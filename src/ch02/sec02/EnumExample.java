package ch02.sec02;

import java.util.Calendar;

public class EnumExample {
    public static void main(String[] args) {
        // 열거 타입 사용하기
        Week today;
        today = Week.MONDAY;
        System.out.println("today = " + today);

        // System.out.println("MONDAY" == Week.MONDAY); Enum 타입은 일반 문자열과는 다르다.


        // Calendar 객체를 사용하여 요일 변환하기
        Calendar now = Calendar.getInstance();

        // now 변수 안에 요일 정보를 추출 - 1~7 정수 데이터 (시작은 일요일)
        int week = now.get(Calendar.DAY_OF_WEEK);
        System.out.println("week = " + week);

        today = switch (week) {
            case 1 -> Week.SUNDAY;
            case 2 -> Week.MONDAY;
            case 3 -> Week.TUESDAY;
            case 4 -> Week.WEDNESDAY;
            case 5 -> Week.THURSDAY;
            case 6 -> Week.FRIDAY;
            case 7 -> Week.SATURDAY;
            default -> null;
        };

        System.out.println("Today is... " + today);

    }
}
