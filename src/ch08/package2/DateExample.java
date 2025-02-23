package ch08.package2;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        /*
        Date 클래스
        날짜를 표현하는 클래이다. 객체 간에 날짜 정보를 주고 받을 때 사용된다.
         */

        Date now = new Date();
        String nowStr1 = now.toString();
        System.out.println("nowStr1 = " + nowStr1);

        SimpleDateFormat pattern = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        String strNow2 = pattern.format(now);
        System.out.println("strNow2 = " + strNow2);

        SimpleDateFormat pattern2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
        String strNo3 = pattern2.format(now);
        System.out.println("strNo3 = " + strNo3);


























    }
}
