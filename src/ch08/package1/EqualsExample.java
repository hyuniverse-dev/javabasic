package ch08.package1;

public class EqualsExample {
    /*
    java.base 모듈 - Object 클래스
        - 클래스를 선언할 때 extends 키워드로 다른 클래스를 상속하지 않으면 암시적으로
          java.lang.Object 클래스를 상속 받는다.
        - 따라서 자바의 모든 클래스는 Object의 자식이거나 자손이다.
        - Object 클래스가 가진 메소드를 모든 객체에서 동일하게 사용할 수 있다.
        - Object 클래스가 가진 메소드는 다음과 같습니다.
            1. equals() - 객체의 번지와 값을 비교하고 결과를 리턴
            2. hashCode() - 객체의 해시코드를 리턴
            3. toString() - 객체의 문자 정보를 리턴
     */

    public static void main(String[] args) {
        Member m1 = new Member("blue", "noah");
        Member m2 = new Member("blue", "noah");
        Member m3 = new Member("red", "isla");

        if (m1.equals(m2)) {
            System.out.println("m1과 m2는 동등합니다.");
        } else {
            System.out.println("m1과 m2는 동등하지 않습니다.");
        }

        if (m1.equals(m3)) {
            System.out.println("m1과 m3는 동등합니다.");
        } else {
            System.out.println("m1과 m3는 동등하지 않습니다.");
        }

    }
}
