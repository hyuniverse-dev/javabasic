package ch08.package1;

public class ToStringExample {
    public static void main(String[] args) {
        /*
        Object 의 toString() 메소드는 개체의 문자 정보(패키지정보 + 참조주소)를 리턴한다.
        객체의 상세 데이터가 필요한 경우 @Override 로 메소드를 재정의 할 수 있다.
        toString() 메소드를 호출하면 재정의된 toString() 메소드를 호출하여 객체의 데이터를 확인할 수 있다.
         */
        SmartPhone smartPhone = new SmartPhone("애플", "아이폰");
        System.out.println("smartPhone = " + smartPhone.toString());
    }
}
