package ch03.sec03.package2;

import ch03.sec03.package1.A;

public class D { // 실행 클래스
    public static void main(String[] args) {
        A a = new A(); // a 인스턴스 생성 가능
//        B b = new B(); -> default 클래스이기 때문에 b 인스턴스 생성 불가

//        a.numberA; -> default 필드이기 때문에 호출 불가
        int numberA2 = a.numberA2;
        
//        a.printA(); -> default 메소드이기 때문에 호출 불가
        a.printA2();
    }
}
