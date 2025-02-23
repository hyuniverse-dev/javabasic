package ch08.package2;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {
    public static void main(String[] args) {
        /*
        달력을 표현한 추상 클래스이다. 날짜와 시간을 계산하는 방법이
        지역과 문화에 따르기 때문에 특정 역법에 따르는 달력은 자식 클래스에서
        구현하도록 되어 있다.

        getInstance() 메소드로 컴퓨터에 설정되어 있는 시간대(TimeZone)를 기준으로
        시간 데이터를 얻을 수 있다.
         */

        TimeZone timeZone = TimeZone.getTimeZone("Japan");
        Calendar now = Calendar.getInstance(timeZone);
        System.out.println("now = " + now); // 1740269849694

        // 년도 데이터
        int year = now.get(Calendar.YEAR);
        System.out.println("year = " + year);

        // 월 데이터
        int month = now.get(Calendar.MONTH) + 1;
        System.out.println("month = " + month);

        // 일 데이터
        int day = now.get(Calendar.DAY_OF_MONTH);
        System.out.println("day = " + day);

        // 요일 데이터
        int week = now.get(Calendar.DAY_OF_WEEK);
        System.out.println("week = " + week);

        // 요일 정수 데이터를 문자열로 변환
        String weekName = switch (week) {
            case Calendar.MONDAY -> "월요일";
            case Calendar.TUESDAY -> "화요일";
            case Calendar.WEDNESDAY -> "수요일";
            case Calendar.THURSDAY -> "목요일";
            case Calendar.FRIDAY -> "금요일";
            case Calendar.SATURDAY -> "토요일";
            default -> "일요일";
        };

        System.out.println("weekName = " + weekName);

        // 오전 / 오후 데이터
        int amPm = now.get(Calendar.AM_PM);
        String amPmStr = switch (amPm) {
            case Calendar.AM -> "오전";
            default -> "오후";
        };
        System.out.println("amPmStr = " + amPmStr);


    }
}
