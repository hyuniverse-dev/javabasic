package ch08.package2;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        /*
        래퍼 클래스(Wrapper Class)

        기본 타입(byte, char, short, int, long, float, double)의 값을 갖는 '객체'를 생성한다.
        이런 객체를 포장 객체락 한다. 기본형 값을 포장하고 있다고 하여 지어진 이름이다.
        
        
        박싱과 언박싱(Boxing / UnBoxing)
        박싱: 기본 타입의 값 -> 객체로 포장하는 과정
        언박싱: 객체로 포장된 값 -> 기본 타입의 값으로 추출하는 과정
         */
        Integer number = 100; // 기본 값 -> 객체로 포장 (박싱)
        int intValue = number; // 객체 -> 기본 값으로 추출 (언박싱)
        System.out.println("intValue = " + intValue);

        double doubleValue = number.doubleValue();
        System.out.println("doubleValue = " + doubleValue);

        String stringValue = number.toString();
        System.out.println("stringValue = " + stringValue);

        Integer number2 = 100;
        boolean result = number.equals(number2);
        System.out.println("result = " + result);

        /*
        포장 클래스에는 null 대입이 가능하다.
        초기값을 반드시 지정하지 않아도 된다는 장점이 존재한다.
         */
        Integer number3;
        Boolean boolValue;
        Long longValue;
        Double dblValue;

    }

}
