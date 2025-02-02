package ch03.sec02;

public class TelevisionExample {
    public static void main(String[] args) {

        String info = Television.info;
        System.out.println("info = " + info);

        Television tv1 = new Television();
        tv1.color = "화이트";
        System.out.println(Television.info + " / " + tv1.color);

        Television tv2 = new Television();
        tv2.color = "블랙";
        System.out.println(Television.info + " / " + tv2.color);

        Television.company = "삼성";
        System.out.println(Television.company);

        // final 로 선언된 필드 수정하기
        // tv1.callCenter = "031-123-1234"; -> 고정된 값이기 때문에 수정 불가


    }
}
