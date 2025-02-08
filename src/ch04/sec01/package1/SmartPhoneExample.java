package ch04.sec01.package1;

import ch04.sec01.package2.Phone;

public class SmartPhoneExample {
    public static void main(String[] args) {
        // 부모 클래스로 정의한 클래스를 직접 사용해도 무관
        Phone phone = new Phone("아이폰", "화이트");

        // 스마트폰 객체 생성
        SmartPhone smartPhone = new SmartPhone("화이트", "아이폰15", false);

        // 부모 클래스에 정의되어 있는 메소드
        smartPhone.bell();
        smartPhone.sendVoice("안녕하세요");
        smartPhone.receiveVoice("안녕하세요. 000학원 입니다.");
        smartPhone.hangUp();

        // 자식 클래스에 정의되어 있는 메소드
        smartPhone.setWifiOn(true);
        smartPhone.internet();

        System.out.println(smartPhone.isWifiOn());

        System.out.println(smartPhone.getColor());
        System.out.println(smartPhone.getModel());
        System.out.println(smartPhone.getData());
    }
}
